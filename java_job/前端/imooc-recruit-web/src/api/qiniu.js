
//	此资源由 58学课资源站 收集整理
//	想要获取完整课件资料 请访问：58xueke.com
//	百万资源 畅享学习
import request from '@/utils/request'

export function getToken() {
    return request({
        url: '/qiniu/upload/token', // 假地址 自行替换
        method: 'get'
    })
}
