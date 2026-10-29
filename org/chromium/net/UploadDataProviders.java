package org.chromium.net;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.lang.invoke.VarHandle;
import java.nio.ByteBuffer;
import p000.C0638f5;
import p000.ac6;
import p000.bt5;
import p000.cr5;
import p000.rr5;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class UploadDataProviders {
    private UploadDataProviders() {
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        rr5 rr5Var = new rr5((byte) 10);
        rr5Var.f29555b = parcelFileDescriptor;
        VarHandle.storeStoreFence();
        return new ac6(rr5Var);
    }

    public static UploadDataProvider create(File file) {
        bt5 bt5Var = new bt5((byte) 7);
        bt5Var.f15596b = file;
        VarHandle.storeStoreFence();
        return new ac6(bt5Var);
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new cr5(byteBuffer.slice(), (byte) 4);
    }

    public static UploadDataProvider create(byte[] bArr) {
        return C0638f5.m5539j(bArr, 0, bArr.length);
    }

    public static UploadDataProvider create(byte[] bArr, int i, int i2) {
        return C0638f5.m5539j(bArr, i, i2);
    }
}
