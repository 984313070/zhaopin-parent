/* ============================================================
 * jquery.login.js  登录页js集合
 * ============================================================
 * Copyright 74cms.
 * ============================================================ */
!function($) {

	// 处理圆角
	if (window.PIE) { 
	    $('.pie_about').each(function() {
	        PIE.attach(this);
	    });
	}

    // 回车登录
	$('.J_loginword').bind('keypress', function(event) {
        if (event.keyCode == "13") {
            $(this).closest('.type_box').find('.btnbox .btn_login').click();
        }
    });

    // 后台是否开启验证
    var captcha_open = eval($('#J_captcha_open').val());
	// 图形验证码
    var verifyPhoto = false;

    // 图片验证码
    function verifyPhotoDialog() {
        var verifyCodeDialog = $(this).dialog({
            title: '请输入下图中的文字或字母',
            content: [
                '<div class="dia-captcha-item">',
                '<img src="' + qscms.root + '?m=Home&c=captcha&a=captcha&t=' + (new Date()).getTime() + '" class="dia-captcha-img">',
                '<input type="text" name="captcha-solution" class="dia-captcha-solution" maxlength="10">',
                '</div>'
            ].join(''),
            btnOne: true,
            loadFun: function() {
                $('.dia-captcha-img').die().live('click', function() {
                    $(this).attr('src', qscms.root + '?m=Home&c=captcha&a=captcha&t=' + (new Date()).getTime());
                })
            },
            yes: function() {
                var currentPhotoVal = $.trim($('.dia-captcha-solution').val());
                if (currentPhotoVal.length) {
                    $.ajax({
                        url: qscms.root + '?m=Home&c=captcha&a=captchaCode',
                        cache: false,
                        async: false,
                        type: 'post',
                        dataType: 'json',
                        data: { postcaptcha: currentPhotoVal },
                        success: function(result) {
                            if (result.status) {
                                verifyCodeDialog.hide();
                                validDoSomethig();
                            } else {
                                disapperTooltip("remind", '验证码输入错误');
                            }
                        }
                    });
                } else {
                    $('.dia-captcha-solution').focus();
                    disapperTooltip("remind", '请输入文字或字母');
                }
            }
        })
        verifyCodeDialog.setCloseDialog(false);
    }

    // 登录方法
    function doLogin() {
        var loginTypeValue = eval($('#J_loginType').val());
        $('.type_box').eq(loginTypeValue).find('.btnbox .btn_login').val('正在登录中...').prop('disabled', !0).addClass('btn_disabled');
        if (loginTypeValue) {

        } else {

        }
    }
    // 发送验证码
    function sendSms() {
        $('#getVerfyCode').prop("disabled", !0);
        $('#getVerfyCode').addClass('btn_disabled');
        $('#getVerfyCode').val('发送中...');
        var mobileValue = $.trim($('input[name=mobile]').val());
        $.ajax({
            url: qscms.root + '?m=Home&c=Members&a=reg_send_sms',
            cache: false,
            async: false,
            type: 'post',
            dataType: 'json',
            data: { sms_type: 'login', mobile: mobileValue},
            success: function(result) {
                if (result.status) {
                    disapperTooltip("success", "验证码已发送，请注意查收");
                    // 开始倒计时
                    var countdown = 180;
                    function settime() {
                        if (countdown == 0) {
                            $('#getVerfyCode').prop("disabled", 0);
                            $('#getVerfyCode').removeClass('btn_disabled');
                            $('#getVerfyCode').val('获取验证码');
                            countdown = 180;
                            return;
                        } else {
                            $('#getVerfyCode').prop("disabled", !0);
                            $('#getVerfyCode').addClass('btn_disabled');
                            $('#getVerfyCode').val('重新发送' + countdown + '秒');
                            countdown--;
                        }
                        setTimeout(function() {
                            settime()
                        },1000)
                    }
                    settime();
                } else {
                    $('#getVerfyCode').prop("disabled", 0);
                    $('#getVerfyCode').removeClass('btn_disabled');
                    $('#getVerfyCode').val('获取验证码');
                    var loginTypeValue = eval($('#J_loginType').val());
                    $('.type_box').eq(loginTypeValue).addClass('openerr');
                    $('.type_box').eq(loginTypeValue).find('.J_errbox').text(result.msg);
                }
            }
        });
    }
    // 极验通过之后需要做的操作
    function validDoSomethig() {
        var toType = eval($('#J_sendVerifyType').val());
        var loginTypeValue = eval($('#J_loginType').val());
        if (toType) { // 1为发送验证码

        } else {
            doLogin();
        }
    }

    // 删除隐藏极验表单
    function clearHideGee() {
        if ($('.geetest_challenge').length) {
            $('.geetest_challenge').remove();
            $('.geetest_validate').remove();
            $('.geetest_seccode').remove();
        }
    }

    // 账号登录
    $('#J_dologin').die().live('click', function() {
        var usernameValue = $.trim($('#username').val());
        var passwordValue = $.trim($('#password').val());
        var expireValue = $.trim($('input[name=expire]').val());
        var $thisTypeBox = $(this).closest('.type_box');
        if (usernameValue == "") {
            $thisTypeBox.addClass('openerr');
            $thisTypeBox.find('.J_errbox').text('请填写手机号/会员名/邮箱');
            $('#username').focus();
            return false;
        }
        if (passwordValue == "") {
            $thisTypeBox.addClass('openerr');
            $thisTypeBox.find('.J_errbox').text('请填写密码');
            $('#password').focus();
            return false;
        }
        $thisTypeBox.removeClass('openerr');
        // 登录错误次数达到最大值
        if($("#verify_userlogin").val()==1){
            // 标识为登录
            $('#J_sendVerifyType').val('0');
            if (verifyPhoto) {
                // 图形验证码
                verifyPhotoDialog();
            } else {
                if (captcha_open) {
                    $('.geetest_panel').remove();
                    clearHideGee();
                    $.ajax({
                        url: qscms.root+'?m=Home&c=captcha&t=' + (new Date()).getTime(),
                        type: "get",
                        dataType: "json",
                        success: function (data) {
                            initGeetest({
                                gt: data.gt,
                                challenge: data.challenge,
                                offline: !data.success,
                                new_captcha: data.new_captcha,
                                product: 'bind'
                            }, function(captchaObj) {
                                captchaObj.appendTo("#popup-captcha");
                                captchaObj.onSuccess(function() {
                                    var usernameValue = $.trim($('#username').val());
                                    var passwordValue = $.trim($('#password').val());
                                    var expireValue = $.trim($('input[name=expire]').val());
                                    var $thisTypeBox = $('#J_dologin').closest('.type_box');
                                    var captChaResult = captchaObj.getValidate();
                                    // 提交表单
                                    $.ajax({
                                        url: qscms.root+'?m=Home&c=Members&a=login',
                                        type: "post",
                                        dataType: "json",
                                        data: {
                                            username: usernameValue,
                                            password: passwordValue,
                                            expire: expireValue,
                                            geetest_challenge: captChaResult.geetest_challenge,
                                            geetest_validate: captChaResult.geetest_validate,
                                            geetest_seccode: captChaResult.geetest_seccode
                                        },
                                        success: function (result) {
                                            if (parseInt(result.status)) {
                                                window.location.href = result.data;
                                            } else {
                                                $thisTypeBox.addClass('openerr');
                                                $thisTypeBox.find('.J_errbox').text(result.msg);
                                                $('#J_dologin').val('登录').prop('disabled', 0).removeClass('btn_disabled');
                                                $("#verify_userlogin").val(result.data);
                                            }
                                        }
                                    });
                                });
                                captchaObj.onReady(function () {
                                    $("#btnCheckLoginName").click();
                                });
                                $('#btnCheckLoginName').click(function () {
                                    captchaObj.verify();
                                })
                            });
                        },
                        error:function(data){
                            var loginTypeValue = eval($('#J_loginType').val());
                            $('.type_box').eq(loginTypeValue).addClass('openerr');
                            $('.type_box').eq(loginTypeValue).find('.J_errbox').text(data['responseText']);
                            $('.type_box').eq(loginTypeValue).find('.btnbox .btn_login').val('无法完成登录');
                        }
                    });
                } else {
                    var usernameValue = $.trim($('#username').val());
                    var passwordValue = $.trim($('#password').val());
                    var expireValue = $.trim($('input[name=expire]').val());
                    var $thisTypeBox = $('#J_dologin').closest('.type_box');
                    // 提交表单
                    $.ajax({
                        url: qscms.root+'?m=Home&c=Members&a=login',
                        type: "post",
                        dataType: "json",
                        data: {
                            username: usernameValue,
                            password: passwordValue,
                            expire: expireValue
                        },
                        success: function (result) {
                            if (parseInt(result.status)) {
                                window.location.href = result.data;
                            } else {
                                $thisTypeBox.addClass('openerr');
                                $thisTypeBox.find('.J_errbox').text(result.msg);
                                $('#J_dologin').val('登录').prop('disabled', 0).removeClass('btn_disabled');
                                $("#verify_userlogin").val(result.data);
                            }
                        }
                    });
                }
            }
        } else {
            // 直接登录
            var usernameValue = $.trim($('#username').val());
            var passwordValue = $.trim($('#password').val());
            var expireValue = $.trim($('input[name=expire]').val());
            var $thisTypeBox = $('#J_dologin').closest('.type_box');
            // 提交表单
            $.ajax({
                url: qscms.root+'?m=Home&c=Members&a=login',
                type: "post",
                dataType: "json",
                data: {
                    username: usernameValue,
                    password: passwordValue,
                    expire: expireValue
                },
                success: function (result) {
                    if (parseInt(result.status)) {
                        window.location.href = result.data;
                    } else {
                        $thisTypeBox.addClass('openerr');
                        $thisTypeBox.find('.J_errbox').text(result.msg);
                        $('#J_dologin').val('登录').prop('disabled', 0).removeClass('btn_disabled');
                        $("#verify_userlogin").val(result.data);
                    }
                }
            });
        }
    });

    // 手机动态码登录
    var regularMobile = qscms.regularMobile; // 验证手机号正则
    $('#J_dologinByMobile').die().live('click', function() {
        var mobileValue = $.trim($('input[name=mobile]').val());
        var verfyCodeValue = $.trim($('input[name=verfy_code]').val());
        var expireValue = $.trim($('input[name=expire_obile]').val());
        var $thisTypeBox = $(this).closest('.type_box');
        if (mobileValue == "") {
            $thisTypeBox.addClass("openerr");
            $thisTypeBox.find('.J_errbox').text('请输入手机号');
            $('input[name=mobile]').focus();
            return false;
        }
        if (mobileValue != "" && !regularMobile.test(mobileValue)) {
            $thisTypeBox.addClass('openerr');
            $thisTypeBox.find('.J_errbox').text('手机号码格式不正确');
            return false;
        }
        if (verfyCodeValue == "") {
            $thisTypeBox.addClass("openerr");
            $thisTypeBox.find('.J_errbox').text('请填写验证码');
            $('input[name=verfy_code]').focus();
            return false;
        }
        $thisTypeBox.removeClass("openerr");
        // 判断登录错误次数是否达到最大值
        if($("#verify_userlogin").val()==1){
            // 标识为登录
            $('#J_sendVerifyType').val('0');
            if (verifyPhoto) {
                // 图片验证码
                verifyPhotoDialog();
            } else {
                if (captcha_open) {
                    $('.geetest_panel').remove();
                    clearHideGee();
                    $.ajax({
                        url: qscms.root+'?m=Home&c=captcha&t=' + (new Date()).getTime(),
                        type: "get",
                        dataType: "json",
                        success: function (data) {
                            initGeetest({
                                gt: data.gt,
                                challenge: data.challenge,
                                offline: !data.success,
                                new_captcha: data.new_captcha,
                                product: 'bind'
                            }, function(captchaObj) {
                                captchaObj.appendTo("#popup-captcha");
                                captchaObj.onSuccess(function() {
                                    var mobileValue = $.trim($('input[name=mobile]').val());
                                    var verfyCodeValue = $.trim($('input[name=verfy_code]').val());
                                    var expireValue = $.trim($('input[name=expire_obile]').val());
                                    var $thisTypeBox = $('#J_dologinByMobile').closest('.type_box');
                                    var captChaResult = captchaObj.getValidate();
                                    // 提交表单
                                    $.ajax({
                                        url: qscms.root+'?m=Home&c=Members&a=login',
                                        type: "post",
                                        dataType: "json",
                                        data: {
                                            mobile: mobileValue,
                                            mobile_vcode: verfyCodeValue,
                                            expire: expireValue,
                                            geetest_challenge: captChaResult.geetest_challenge,
                                            geetest_validate: captChaResult.geetest_validate,
                                            geetest_seccode: captChaResult.geetest_seccode
                                        },
                                        success: function (result) {
                                            if (parseInt(result.status)) {
                                                window.location.href = result.data;
                                            } else {
                                                $thisTypeBox.addClass('openerr');
                                                $thisTypeBox.find('.J_errbox').text(result.msg);
                                                $('#J_dologinByMobile').val('登录').prop('disabled', 0).removeClass('btn_disabled');
                                                $("#verify_userlogin").val(result.data);
                                            }
                                        }
                                    })
                                })
                                $('#btnCheckLoginMobile').click(function () {
                                    captchaObj.verify();
                                })
                                captchaObj.onReady(function () {
                                    $("#btnCheckLoginMobile").click();
                                });
                            });
                        },
                        error:function(data){
                            var loginTypeValue = eval($('#J_loginType').val());
                            $('.type_box').eq(loginTypeValue).addClass('openerr');
                            $('.type_box').eq(loginTypeValue).find('.J_errbox').text(data['responseText']);
                            $('.type_box').eq(loginTypeValue).find('.btnbox .btn_login').val('无法完成登录');
                        }
                    });
                } else {
                    var mobileValue = $.trim($('input[name=mobile]').val());
                    var verfyCodeValue = $.trim($('input[name=verfy_code]').val());
                    var expireValue = $.trim($('input[name=expire_obile]').val());
                    var $thisTypeBox = $('#J_dologinByMobile').closest('.type_box');
                    // 提交表单
                    $.ajax({
                        url: qscms.root+'?m=Home&c=Members&a=login',
                        type: "post",
                        dataType: "json",
                        data: {
                            mobile: mobileValue,
                            mobile_vcode: verfyCodeValue,
                            expire: expireValue
                        },
                        success: function (result) {
                            if (parseInt(result.status)) {
                                window.location.href = result.data;
                            } else {
                                $thisTypeBox.addClass('openerr');
                                $thisTypeBox.find('.J_errbox').text(result.msg);
                                $('#J_dologinByMobile').val('登录').prop('disabled', 0).removeClass('btn_disabled');
                                $("#verify_userlogin").val(result.data);
                            }
                        }
                    })
                }
            }
        } else {
            // 直接登录
            var mobileValue = $.trim($('input[name=mobile]').val());
            var verfyCodeValue = $.trim($('input[name=verfy_code]').val());
            var expireValue = $.trim($('input[name=expire_obile]').val());
            var $thisTypeBox = $('#J_dologinByMobile').closest('.type_box');
            // 提交表单
            $.ajax({
                url: qscms.root+'?m=Home&c=Members&a=login',
                type: "post",
                dataType: "json",
                data: {
                    mobile: mobileValue,
                    mobile_vcode: verfyCodeValue,
                    expire: expireValue
                },
                success: function (result) {
                    if (parseInt(result.status)) {
                        window.location.href = result.data;
                    } else {
                        $thisTypeBox.addClass('openerr');
                        $thisTypeBox.find('.J_errbox').text(result.msg);
                        $('#J_dologinByMobile').val('登录').prop('disabled', 0).removeClass('btn_disabled');
                        $("#verify_userlogin").val(result.data);
                    }
                }
            })
        }
    });

    $('input[name="mobile"]').keyup(function(event) {
        var $thisTypeBox = $(this).closest('.type_box');
        var mobileValue = $(this).val();
        if (mobileValue.length >= 11) {
            if (mobileValue != "" && !regularMobile.test(mobileValue)) {
                $thisTypeBox.addClass('openerr');
                $thisTypeBox.find('.J_errbox').text('手机号码格式不正确');
                return false;
            }
            $thisTypeBox.removeClass('openerr');
            $thisTypeBox.find('.J_errbox').text('');
        }
    });

    // 获取验证码
    $('#getVerfyCode').die().live('click', function(event) {
        var mobileValue = $('input[name="mobile"]').val();
        var $thisTypeBox = $(this).closest('.type_box');
        if (!mobileValue.length) {
            $thisTypeBox.addClass('openerr');
            $thisTypeBox.find('.J_errbox').text('请填写手机号码');
            $('input[name="mobile"]').focus();
            return false;
        }
        if (mobileValue != "" && !regularMobile.test(mobileValue)) {
            $thisTypeBox.addClass('openerr');
            $thisTypeBox.find('.J_errbox').text('手机号码格式不正确');
            $('input[name="mobile"]').focus();
            return false;
        }
        $.ajax({
            url: qscms.root + '?m=Home&c=Members&a=ajax_check',
            cache: false,
            async: false,
            type: 'post',
            dataType: 'json',
            data: { type: 'mobile', param: mobileValue },
            success: function(result) {
                if (!result.status) {
                    // 标识为发验证码
                    $('#J_sendVerifyType').val('1');
                    if (captcha_open) {
                        // 后台开启验证
                        if (verifyPhoto) {
                            // 图片验证码
                            verifyPhotoDialog();
                        } else {
                            $('.geetest_panel').remove();
                            clearHideGee();
                            if (parseInt(qscms.smsTatus)) {
                                if (eval($('#J_captcha_varify_send').val())) {
                                    $.ajax({
                                        // 获取id，challenge，success（是否启用failback）
                                        url: qscms.root+'?m=Home&c=captcha&t=' + (new Date()).getTime(), // 加随机数防止缓存
                                        type: "get",
                                        dataType: "json",
                                        success: function (data) {
                                            // 使用initGeetest接口
                                            // 参数1：配置参数
                                            // 参数2：回调，回调的第一个参数验证码对象，之后可以使用它做appendTo之类的事件
                                            initGeetest({
                                                gt: data.gt,
                                                challenge: data.challenge,
                                                offline: !data.success, // 表示用户后台检测极验服务器是否宕机
                                                new_captcha: data.new_captcha, // 用于宕机时表示是新验证码的宕机
                                                product: 'bind'
                                            }, function(captchaObj) {
                                                captchaObj.appendTo("#popup-captcha");
                                                captchaObj.onSuccess(function() {
                                                    $('#getVerfyCode').prop("disabled", !0);
                                                    $('#getVerfyCode').addClass('btn_disabled');
                                                    $('#getVerfyCode').val('发送中...');
                                                    var mobileValue = $.trim($('input[name=mobile]').val());
                                                    var captChaResult = captchaObj.getValidate();
                                                    $.ajax({
                                                        url: qscms.root + '?m=Home&c=Members&a=reg_send_sms',
                                                        cache: false,
                                                        async: false,
                                                        type: 'post',
                                                        dataType: 'json',
                                                        data: { sms_type: 'login', mobile: mobileValue,geetest_challenge: captChaResult.geetest_challenge,geetest_validate: captChaResult.geetest_validate,geetest_seccode: captChaResult.geetest_seccode},
                                                        success: function(result) {
                                                            if (result.status) {
                                                                disapperTooltip("success", "验证码已发送，请注意查收");
                                                                // 开始倒计时
                                                                var countdown = 180;
                                                                function settime() {
                                                                    if (countdown == 0) {
                                                                        $('#getVerfyCode').prop("disabled", 0);
                                                                        $('#getVerfyCode').removeClass('btn_disabled');
                                                                        $('#getVerfyCode').val('获取验证码');
                                                                        countdown = 180;
                                                                        return;
                                                                    } else {
                                                                        $('#getVerfyCode').prop("disabled", !0);
                                                                        $('#getVerfyCode').addClass('btn_disabled');
                                                                        $('#getVerfyCode').val('重新发送' + countdown + '秒');
                                                                        countdown--;
                                                                    }
                                                                    setTimeout(function() {
                                                                        settime()
                                                                    },1000)
                                                                }
                                                                settime();
                                                            } else {
                                                                $('#getVerfyCode').prop("disabled", 0);
                                                                $('#getVerfyCode').removeClass('btn_disabled');
                                                                $('#getVerfyCode').val('获取验证码');
                                                                var loginTypeValue = eval($('#J_loginType').val());
                                                                $('.type_box').eq(loginTypeValue).addClass('openerr');
                                                                $('.type_box').eq(loginTypeValue).find('.J_errbox').text(result.msg);
                                                            }
                                                        }
                                                    });
                                                });
                                                captchaObj.onReady(function () {
                                                    $("#btnCheck").click();
                                                });
                                                $('#btnCheck').click(function () {
                                                    captchaObj.verify();
                                                })
                                            });
                                        },
                                        error:function(data){
                                            var loginTypeValue = eval($('#J_loginType').val());
                                            $('.type_box').eq(loginTypeValue).addClass('openerr');
                                            $('.type_box').eq(loginTypeValue).find('.J_errbox').text(data['responseText']);
                                            $('.type_box').eq(loginTypeValue).find('.btnbox .btn_login').val('无法完成登录');
                                        }
                                    });
                                } else {
                                    sendSms();
                                }
                            } else {
                                disapperTooltip("remind", "短信未开启");
                            }
                        }
                    } else {
                        sendSms();
                    }
                } else {
                    $thisTypeBox.addClass('openerr');
                    $thisTypeBox.find('.J_errbox').text('账号不存在！');
                }
            }
        });
    });

    // 是否自动登录
    $('.J_expire').click(function() {
        if ($(this).is(':checked')) {
            $(this).val('1');
        } else {
            $(this).val('0');
        }
    });

    // banner图切换
    var aDiv = $(".banner_list"),
        index = 0,
        timer = null;
    timer = setInterval(function() {
        startFocus();
    }, 10000);
    function startFocus() {
        index++;
        index = index > aDiv.size() - 1 ? 0 : index;
        aDiv.eq(index)
        .stop()
        .animate({
            'opacity': 1
        }, 300)
        .css({
            'z-index': 0
        })
        .siblings(".banner_list")
        .stop()
        .animate({
            'opacity': 0
        }, 300)
        .css({
            'z-index': 0
        });
    }
    
    function stopFoucs() {
        clearInterval(timer);
    };

    // 登录方式切换
    $('#forMobileLogin').click(function() {
        var thisIndex = $(this).data('index');
        $('#J_loginType').val(thisIndex);
        $('.switch_txt').eq(thisIndex).addClass('active').siblings('.switch_txt').removeClass('active');
        $('.type_box').eq(thisIndex).addClass('active').siblings('.type_box').removeClass('active');
        $('#forAccountLogin').show();
    });

    $('#forAccountLogin').click(function() {
        var thisIndex = $(this).data('index');
        $('#J_loginType').val(thisIndex);
        $('.switch_txt').eq(thisIndex).addClass('active').siblings('.switch_txt').removeClass('active');
        $('.type_box').eq(thisIndex).addClass('active').siblings('.type_box').removeClass('active');
        $('#forAccountLogin').hide();
    });
	
}(window.jQuery);