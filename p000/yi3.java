package p000;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.invoke.VarHandle;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yi3 implements Closeable {

    /* JADX INFO: renamed from: g */
    public static final Logger f35238g = Logger.getLogger(yi3.class.getName());

    /* JADX INFO: renamed from: a */
    public final RandomAccessFile f35239a;

    /* JADX INFO: renamed from: b */
    public int f35240b;

    /* JADX INFO: renamed from: c */
    public int f35241c;

    /* JADX INFO: renamed from: d */
    public vi3 f35242d;

    /* JADX INFO: renamed from: e */
    public vi3 f35243e;

    /* JADX INFO: renamed from: f */
    public final byte[] f35244f;

    public yi3(File file) throws IOException {
        byte[] bArr = new byte[16];
        this.f35244f = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    m13127B(bArr2, i, iArr[i2]);
                    i += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    wb1.m12191j("Rename failed!");
                    throw null;
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f35239a = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int iM13128k = m13128k(0, bArr);
        this.f35240b = iM13128k;
        if (iM13128k <= randomAccessFile2.length()) {
            this.f35241c = m13128k(4, bArr);
            int iM13128k2 = m13128k(8, bArr);
            int iM13128k3 = m13128k(12, bArr);
            this.f35242d = m13134j(iM13128k2);
            this.f35243e = m13134j(iM13128k3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f35240b + ", Actual length: " + randomAccessFile2.length());
    }

    /* JADX INFO: renamed from: B */
    public static void m13127B(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    /* JADX INFO: renamed from: k */
    public static int m13128k(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    /* JADX INFO: renamed from: A */
    public final void m13129A(int i, int i2, int i3, int i4) throws IOException {
        int[] iArr = {i, i2, i3, i4};
        int i5 = 0;
        int i6 = 0;
        while (true) {
            byte[] bArr = this.f35244f;
            if (i5 >= 4) {
                RandomAccessFile randomAccessFile = this.f35239a;
                randomAccessFile.seek(0L);
                randomAccessFile.write(bArr);
                return;
            } else {
                m13127B(bArr, i6, iArr[i5]);
                i6 += 4;
                i5++;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m13130a(byte[] bArr) {
        int iM13139v;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    m13131b(length);
                    boolean zM13133g = m13133g();
                    if (zM13133g) {
                        iM13139v = 16;
                    } else {
                        vi3 vi3Var = this.f35243e;
                        iM13139v = m13139v(vi3Var.f32649b + 4 + vi3Var.f32650c);
                    }
                    vi3 vi3Var2 = new vi3(iM13139v, length, (byte) 0);
                    m13127B(this.f35244f, 0, length);
                    m13137t(this.f35244f, iM13139v, 4);
                    m13137t(bArr, iM13139v + 4, length);
                    m13129A(this.f35240b, this.f35241c + 1, zM13133g ? iM13139v : this.f35242d.f32649b, iM13139v);
                    this.f35243e = vi3Var2;
                    this.f35241c++;
                    if (zM13133g) {
                        this.f35242d = vi3Var2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m13131b(int i) throws IOException {
        int i2 = i + 4;
        int iM13138u = this.f35240b - m13138u();
        if (iM13138u >= i2) {
            return;
        }
        int i3 = this.f35240b;
        do {
            iM13138u += i3;
            i3 <<= 1;
        } while (iM13138u < i2);
        RandomAccessFile randomAccessFile = this.f35239a;
        randomAccessFile.setLength(i3);
        randomAccessFile.getChannel().force(true);
        vi3 vi3Var = this.f35243e;
        int iM13139v = m13139v(vi3Var.f32649b + 4 + vi3Var.f32650c);
        if (iM13139v < this.f35242d.f32649b) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.f35240b);
            long j = iM13139v - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                C1077qn.m9985k("Copied insufficient number of bytes!");
                return;
            }
        }
        int i4 = this.f35243e.f32649b;
        int i5 = this.f35242d.f32649b;
        if (i4 < i5) {
            int i6 = (this.f35240b + i4) - 16;
            m13129A(i3, this.f35241c, i5, i6);
            this.f35243e = new vi3(i6, this.f35243e.f32650c, (byte) 0);
        } else {
            m13129A(i3, this.f35241c, i5, i4);
        }
        this.f35240b = i3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f35239a.close();
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m13132e(xi3 xi3Var) {
        int iM13139v = this.f35242d.f32649b;
        for (int i = 0; i < this.f35241c; i++) {
            vi3 vi3VarM13134j = m13134j(iM13139v);
            xi3Var.mo7973a(new wi3(this, vi3VarM13134j), vi3VarM13134j.f32650c);
            iM13139v = m13139v(vi3VarM13134j.f32649b + 4 + vi3VarM13134j.f32650c);
        }
    }

    /* JADX INFO: renamed from: g */
    public final synchronized boolean m13133g() {
        return this.f35241c == 0;
    }

    /* JADX INFO: renamed from: j */
    public final vi3 m13134j(int i) throws IOException {
        if (i == 0) {
            return vi3.f32647d;
        }
        RandomAccessFile randomAccessFile = this.f35239a;
        randomAccessFile.seek(i);
        return new vi3(i, randomAccessFile.readInt(), (byte) 0);
    }

    /* JADX INFO: renamed from: l */
    public final synchronized void m13135l() {
        if (m13133g()) {
            throw new NoSuchElementException();
        }
        if (this.f35241c == 1) {
            synchronized (this) {
                m13129A(4096, 0, 0, 0);
                this.f35241c = 0;
                vi3 vi3Var = vi3.f32647d;
                this.f35242d = vi3Var;
                this.f35243e = vi3Var;
                if (this.f35240b > 4096) {
                    RandomAccessFile randomAccessFile = this.f35239a;
                    randomAccessFile.setLength(4096L);
                    randomAccessFile.getChannel().force(true);
                }
                this.f35240b = 4096;
            }
        } else {
            vi3 vi3Var2 = this.f35242d;
            int iM13139v = m13139v(vi3Var2.f32649b + 4 + vi3Var2.f32650c);
            m13136q(iM13139v, 0, 4, this.f35244f);
            int iM13128k = m13128k(0, this.f35244f);
            m13129A(this.f35240b, this.f35241c - 1, iM13139v, this.f35243e.f32649b);
            this.f35241c--;
            this.f35242d = new vi3(iM13139v, iM13128k, (byte) 0);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m13136q(int i, int i2, int i3, byte[] bArr) throws IOException {
        int iM13139v = m13139v(i);
        int i4 = iM13139v + i3;
        int i5 = this.f35240b;
        RandomAccessFile randomAccessFile = this.f35239a;
        if (i4 <= i5) {
            randomAccessFile.seek(iM13139v);
            randomAccessFile.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - iM13139v;
        randomAccessFile.seek(iM13139v);
        randomAccessFile.readFully(bArr, i2, i6);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i2 + i6, i3 - i6);
    }

    /* JADX INFO: renamed from: t */
    public final void m13137t(byte[] bArr, int i, int i2) throws IOException {
        int iM13139v = m13139v(i);
        int i3 = iM13139v + i2;
        int i4 = this.f35240b;
        RandomAccessFile randomAccessFile = this.f35239a;
        if (i3 <= i4) {
            randomAccessFile.seek(iM13139v);
            randomAccessFile.write(bArr, 0, i2);
            return;
        }
        int i5 = i4 - iM13139v;
        randomAccessFile.seek(iM13139v);
        randomAccessFile.write(bArr, 0, i5);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i5, i2 - i5);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(yi3.class.getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.f35240b);
        sb.append(", size=");
        sb.append(this.f35241c);
        sb.append(", first=");
        sb.append(this.f35242d);
        sb.append(", last=");
        sb.append(this.f35243e);
        sb.append(", element lengths=[");
        try {
            li0 li0Var = new li0((byte) 2);
            li0Var.f24044c = sb;
            li0Var.f24043b = true;
            VarHandle.storeStoreFence();
            m13132e(li0Var);
        } catch (IOException e) {
            f35238g.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public final int m13138u() {
        if (this.f35241c == 0) {
            return 16;
        }
        vi3 vi3Var = this.f35243e;
        int i = vi3Var.f32649b;
        int i2 = this.f35242d.f32649b;
        return i >= i2 ? (i - i2) + 4 + vi3Var.f32650c + 16 : (((i + 4) + vi3Var.f32650c) + this.f35240b) - i2;
    }

    /* JADX INFO: renamed from: v */
    public final int m13139v(int i) {
        int i2 = this.f35240b;
        return i < i2 ? i : (i + 16) - i2;
    }
}
