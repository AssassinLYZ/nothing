
//	此资源由 58学课资源站 收集整理
//	想要获取完整课件资料 请访问：58xueke.com
//	百万资源 畅享学习
import request from '@/utils/request'

export function getMaxRefreshResumeCounts() {
    return request({
        url: '/sys/params',
        method: 'post'
    })
}

export function modifyMaxResumeRefreshCounts(params) {
    return request({
        url: '/sys/modifyMaxResumeRefreshCounts',
        method: 'post',
        params: params
    })
}
