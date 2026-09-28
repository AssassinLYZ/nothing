
//	此资源由 58学课资源站 收集整理
//	想要获取完整课件资料 请访问：58xueke.com
//	百万资源 畅享学习
import request from '@/utils/request'

export function getWXPayQRCode(merchantOrderId) {
    return request({
        url: '/tradeOrder/generatorWXPayQRCode?merchantOrderId=' + merchantOrderId,
        method: 'post'
    })
}

export function createTradeOrder() {
    return request({
        url: '/tradeOrder/create',
        method: 'post'
    })
}

export function getOrderList(bo) {
    return request({
        url: '/tradeOrder/list?page=' + bo.page + "&limit=" + bo.limit,
        method: 'post'
    })
}

