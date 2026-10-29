package p000;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class w50 {

    /* JADX INFO: renamed from: b */
    public static final String f33100b = se0.m10711Z(UUID.randomUUID().toString() + System.currentTimeMillis());

    /* JADX INFO: renamed from: c */
    public static final AtomicLong f33101c = new AtomicLong(0);

    /* JADX INFO: renamed from: a */
    public final String f33102a;

    public w50() {
        long time = new Date().getTime();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt((int) (time / 1000));
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        byte[] bArrArray = byteBufferAllocate.array();
        byte b = bArrArray[0];
        byte b2 = bArrArray[1];
        byte b3 = bArrArray[2];
        byte b4 = bArrArray[3];
        byte[] bArrM12105a = m12105a(time % 1000);
        byte b5 = bArrM12105a[0];
        byte b6 = bArrM12105a[1];
        byte[] bArrM12105a2 = m12105a(f33101c.incrementAndGet());
        byte b7 = bArrM12105a2[0];
        byte b8 = bArrM12105a2[1];
        byte[] bArrM12105a3 = m12105a(Integer.valueOf(Process.myPid()).shortValue());
        String strM10695H = se0.m10695H(new byte[]{b, b2, b3, b4, b5, b6, b7, b8, bArrM12105a3[0], bArrM12105a3[1]});
        Locale locale = Locale.US;
        this.f33102a = String.format(locale, "%s%s%s%s", strM10695H.substring(0, 12), strM10695H.substring(12, 16), strM10695H.subSequence(16, 20), f33100b.substring(0, 12)).toUpperCase(locale);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m12105a(long j) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.putShort((short) j);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    public final String toString() {
        return this.f33102a;
    }
}
