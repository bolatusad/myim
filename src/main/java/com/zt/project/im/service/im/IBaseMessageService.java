package com.zt.project.im.service.im;

import com.google.protobuf.InvalidProtocolBufferException;
import com.zt.project.im.protobuf.Message;
import io.netty.channel.ChannelHandlerContext;

/**
 * @Author：ZhangTao
 * @Description:
 * @Date: Created in 22:44 2018/4/12
 */
public interface IBaseMessageService {

    void dealMessage(Message.BaseMessage baseMessage, ChannelHandlerContext ctx) throws InvalidProtocolBufferException;
}