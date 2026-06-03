// @ts-ignore
/* eslint-disable */
import request from '@/request'

/** 此处后端没有提供注释 GET /index/ */
export async function index(options?: { [key: string]: any }) {
  return request<API.BaseResponseString>('/index/', {
    method: 'GET',
    ...(options || {}),
  })
}
