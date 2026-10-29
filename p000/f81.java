package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class f81 {

    /* JADX INFO: renamed from: a */
    public final j81 f18834a;

    /* JADX INFO: renamed from: b */
    public final byte[] f18835b;

    public f81(j81 j81Var, byte[] bArr) {
        if (j81Var == null) {
            xy4.m12782k("encoding is null");
            throw null;
        }
        if (bArr == null) {
            xy4.m12782k("bytes is null");
            throw null;
        }
        this.f18834a = j81Var;
        this.f18835b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f81)) {
            return false;
        }
        f81 f81Var = (f81) obj;
        if (this.f18834a.equals(f81Var.f18834a)) {
            return Arrays.equals(this.f18835b, f81Var.f18835b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f18835b) ^ ((this.f18834a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f18834a + ", bytes=[...]}";
    }
}
