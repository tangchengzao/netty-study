package com.tangcz.ch09.demo2.test;

import com.tangcz.ch09.demo2.absinteger.AbsIntegerEncoder;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.embedded.EmbeddedChannel;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author 月汐
 * @date 2020/05/12 14:14
 */
public class AbsIntegerEncoderTest {

    @Test
    public void testEncoded() {
        ByteBuf buf = Unpooled.buffer();
        for (int i = 0; i < 10; i++) {
            buf.writeInt(i * -1);
        }

        EmbeddedChannel channel = new EmbeddedChannel(new AbsIntegerEncoder());
        assertTrue(channel.writeOutbound(buf));
        assertTrue(channel.finish());

        for (int i = 0; i < 10; i++) {
            assertEquals(i, channel.readOutbound());
        }
        assertNull(channel.readOutbound());
    }

}
