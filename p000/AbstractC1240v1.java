package p000;

import java.io.IOException;

/* JADX INFO: renamed from: v1 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1240v1 implements ms2 {
    protected int memoizedHashCode;

    /* JADX INFO: renamed from: b */
    public abstract int mo11101b(fw3 fw3Var);

    /* JADX INFO: renamed from: c */
    public final String m11691c(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    /* JADX INFO: renamed from: d */
    public abstract pr1 mo11102d();

    /* JADX INFO: renamed from: e */
    public final byte[] m11692e() {
        try {
            byte[] bArr = new byte[((tr1) this).mo11101b(null)];
            ya0 ya0VarM13062h = ya0.m13062h(bArr);
            mo11103g(ya0VarM13062h);
            if (ya0VarM13062h.m13063i() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            xy4.m12785n(m11691c("byte array"), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public final o50 m11693f() {
        try {
            int iMo11101b = ((tr1) this).mo11101b(null);
            o50 o50Var = t50.f30782b;
            byte[] bArr = new byte[iMo11101b];
            ya0 ya0VarM13062h = ya0.m13062h(bArr);
            mo11103g(ya0VarM13062h);
            if (ya0VarM13062h.m13063i() == 0) {
                return new o50(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            xy4.m12785n(m11691c("ByteString"), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo11103g(ya0 ya0Var);
}
