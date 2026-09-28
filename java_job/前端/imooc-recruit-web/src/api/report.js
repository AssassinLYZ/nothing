
//	此资源由 58学课资源站 收集整理
//	想要获取完整课件资料 请访问：58xueke.com
//	百万资源 畅享学习
import request from '@/utils/request'

export function getReportList(bo) {
    // console.log(bo);
    return request({
        url: '/report/pagedReportRecordList?page=' + (bo.page-1) + "&pageSize=" + bo.limit,
        method: 'post',
        data: bo
    })
}

export function getJobInfo(params) {
    return request({
        url: '/job/admin/jobDetail',
        method: 'post',
        params: params
    })
}

export function dealJobReportIgnore(params) {
    return request({
        url: '/report/deal/ignore',
        method: 'post',
        params: params
    })
}

export function dealJobReportDelete(params) {
    return request({
        url: '/report/deal/delete',
        method: 'post',
        params: params
    })
}

