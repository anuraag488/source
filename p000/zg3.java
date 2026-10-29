package p000;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zg3 {

    /* JADX INFO: renamed from: a */
    public final int f36063a;

    /* JADX INFO: renamed from: b */
    public final int f36064b;

    /* JADX INFO: renamed from: c */
    public final long f36065c;

    /* JADX INFO: renamed from: d */
    public final long f36066d;

    public zg3(int i, int i2, long j, long j2) {
        this.f36063a = i;
        this.f36064b = i2;
        this.f36065c = j;
        this.f36066d = j2;
    }

    /* JADX INFO: renamed from: a */
    public static zg3 m13549a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            zg3 zg3Var = new zg3(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return zg3Var;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m13550b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f36063a);
            dataOutputStream.writeInt(this.f36064b);
            dataOutputStream.writeLong(this.f36065c);
            dataOutputStream.writeLong(this.f36066d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof zg3)) {
            zg3 zg3Var = (zg3) obj;
            if (this.f36064b == zg3Var.f36064b && this.f36065c == zg3Var.f36065c && this.f36063a == zg3Var.f36063a && this.f36066d == zg3Var.f36066d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f36064b), Long.valueOf(this.f36065c), Integer.valueOf(this.f36063a), Long.valueOf(this.f36066d));
    }
}
