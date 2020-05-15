package com.tangcz.ch10.demo1.decoder;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;

import java.util.List;

/**
 * @author 月汐
 * @date 2020/05/12 17:59
 */
public class IntegerToStringDecoder extends MessageToMessageEncoder<Integer> {
    @Override
    protected void encode(ChannelHandlerContext ctx, Integer msg, List<Object> out) throws Exception {
        out.add(String.valueOf(msg));
    }
}
