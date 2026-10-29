package p000;

import android.util.Base64;
import java.util.Arrays;

/* JADX INFO: renamed from: dv */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0588dv {

    /* JADX INFO: renamed from: a */
    public String f17420a;

    /* JADX INFO: renamed from: b */
    public byte[] f17421b;

    /* JADX INFO: renamed from: c */
    public ag3 f17422c;

    /* JADX INFO: renamed from: a */
    public static jp0 m4741a() {
        jp0 jp0Var = new jp0((byte) 10, false);
        jp0Var.f22483d = ag3.f14485a;
        return jp0Var;
    }

    /* JADX INFO: renamed from: b */
    public final C0588dv m4742b(ag3 ag3Var) {
        jp0 jp0VarM4741a = m4741a();
        jp0VarM4741a.m7225O(this.f17420a);
        if (ag3Var == null) {
            xy4.m12782k("Null priority");
            return null;
        }
        jp0VarM4741a.f22483d = ag3Var;
        jp0VarM4741a.f22481b = this.f17421b;
        return jp0VarM4741a.m7241j();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0588dv) {
            C0588dv c0588dv = (C0588dv) obj;
            if (this.f17420a.equals(c0588dv.f17420a) && Arrays.equals(this.f17421b, c0588dv.f17421b) && this.f17422c.equals(c0588dv.f17422c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f17422c.hashCode() ^ ((((this.f17420a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f17421b)) * 1000003);
    }

    public final String toString() {
        String str = this.f17420a;
        ag3 ag3Var = this.f17422c;
        byte[] bArr = this.f17421b;
        String strEncodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(str);
        sb.append(", ");
        sb.append(ag3Var);
        sb.append(", ");
        return zi4.m13623w(sb, strEncodeToString, ")");
    }
}
