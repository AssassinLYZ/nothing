
//	此资源由 58学课资源站 收集整理
//	想要获取完整课件资料 请访问：58xueke.com
//	百万资源 畅享学习
import request from '@/utils/request'

export function getDataDictList(params) {
    return request({
        url: '/dataDict/list',
        method: 'post',
        params: params
    })
}

export function createDataDict(dataDict) {
    return request({
        url: '/dataDict/create',
        method: 'post',
        data: dataDict
    })
}

export function deleteDataDict(params) {
    return request({
        url: '/dataDict/delete',
        method: 'post',
        params: params
    })
}

export function getDataDictItem(params) {
    return request({
        url: '/dataDict/item',
        method: 'post',
        params: params
    })
}

export function updateDataDict(dataDict) {
    return request({
        url: '/dataDict/modify',
        method: 'post',
        data: dataDict
    })
}


