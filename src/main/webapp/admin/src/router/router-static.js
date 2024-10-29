import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import xueshengxuanke from '@/views/modules/xueshengxuanke/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import kechengmingcheng from '@/views/modules/kechengmingcheng/list'
    import tuikexinxi from '@/views/modules/tuikexinxi/list'
    import jiaoshi from '@/views/modules/jiaoshi/list'
    import gonggaoxinxi from '@/views/modules/gonggaoxinxi/list'
    import banji from '@/views/modules/banji/list'
    import kechengxinxi from '@/views/modules/kechengxinxi/list'
    import kebiaoxinxi from '@/views/modules/kebiaoxinxi/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/xueshengxuanke',
        name: '学生选课',
        component: xueshengxuanke
      }
          ,{
	path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
          ,{
	path: '/kechengmingcheng',
        name: '课程名称',
        component: kechengmingcheng
      }
          ,{
	path: '/tuikexinxi',
        name: '退课信息',
        component: tuikexinxi
      }
          ,{
	path: '/jiaoshi',
        name: '教师',
        component: jiaoshi
      }
          ,{
	path: '/gonggaoxinxi',
        name: '公告信息',
        component: gonggaoxinxi
      }
          ,{
	path: '/banji',
        name: '班级',
        component: banji
      }
          ,{
	path: '/kechengxinxi',
        name: '课程信息',
        component: kechengxinxi
      }
          ,{
	path: '/kebiaoxinxi',
        name: '课表信息',
        component: kebiaoxinxi
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
