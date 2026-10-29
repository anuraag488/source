package p000;

import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wi3 extends InputStream {

    /* JADX INFO: renamed from: a */
    public int f33409a;

    /* JADX INFO: renamed from: b */
    public int f33410b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yi3 f33411c;

    public wi3(yi3 yi3Var, vi3 vi3Var) {
        this.f33411c = yi3Var;
        this.f33409a = yi3Var.m13139v(vi3Var.f32649b + 4);
        this.f33410b = vi3Var.f32650c;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (bArr == null) {
            xy4.m12782k("buffer");
            return 0;
        }
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = this.f33410b;
        if (i3 <= 0) {
            return -1;
        }
        if (i2 > i3) {
            i2 = i3;
        }
        int i4 = this.f33409a;
        yi3 yi3Var = this.f33411c;
        yi3Var.m13136q(i4, i, i2, bArr);
        this.f33409a = yi3Var.m13139v(this.f33409a + i2);
        this.f33410b -= i2;
        return i2;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        yi3 yi3Var = this.f33411c;
        RandomAccessFile randomAccessFile = yi3Var.f35239a;
        if (this.f33410b == 0) {
            return -1;
        }
        randomAccessFile.seek(this.f33409a);
        int i = randomAccessFile.read();
        this.f33409a = yi3Var.m13139v(this.f33409a + 1);
        this.f33410b--;
        return i;
    }
}
