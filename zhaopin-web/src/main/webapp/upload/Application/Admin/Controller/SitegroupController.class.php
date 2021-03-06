<?php
namespace Admin\Controller;
use Common\Controller\ConfigbaseController;
class SitegroupController extends ConfigbaseController{
	public function _initialize() {
        parent::_initialize();
        $this->_mod = D('Config');
    }
    public function index(){
    	$open = I('request.sitegroup_open',0,'intval');
    	if($open){
    		if(C('qscms_uc_open')){
    			$this->error('使用站群系统，请关闭UC功能！');
    		}
            if(C('apply.Subsite')){
                $this->error('使用站群系统，请关闭分站功能！');
            }
    		$user = M('Members')->where(array('sitegroup_uid'=>0))->find();
    		if($user){
    			$this->error('请将站点用户数据全部导入分站集群系统！');
    		}
    	}
        $this->_edit();
        $this->display();
    }
}
?>