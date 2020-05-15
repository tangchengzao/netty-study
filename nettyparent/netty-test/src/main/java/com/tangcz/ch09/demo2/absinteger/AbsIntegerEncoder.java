package com.tangcz.ch09.demo2.absinteger;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;

import java.util.List;

/**
 * @author 月汐
 * @date 2020/05/12 14:12
 */
public class AbsIntegerEncoder extends MessageToMessageEncoder<ByteBuf> {
    @Override
    protected void encode(ChannelHandlerContext ctx, ByteBuf msg, List<Object> out) throws Exception {
        while (msg.readableBytes() >= 4) {
            int value = Math.abs(msg.readInt());
            out.add(value);
        }
    }
}
