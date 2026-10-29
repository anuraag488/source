package p000;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vv1 implements y33 {

    /* JADX INFO: renamed from: a */
    public long f32886a;

    /* JADX INFO: renamed from: b */
    public Object f32887b;

    public vv1(long j, d63 d63Var) {
        this.f32887b = d63Var;
        this.f32886a = j;
    }

    /* JADX INFO: renamed from: a */
    public static long m11990a(vv1 vv1Var, long j, float f) {
        long jM3430h = b33.m3430h(vv1Var.f32886a, j);
        vv1Var.f32886a = jM3430h;
        float fM3426d = ((d63) vv1Var.f32887b) == null ? b33.m3426d(jM3430h) : Math.abs(vv1Var.m11991b(jM3430h));
        if (fM3426d <= 0.0f || fM3426d < f) {
            return 9205357640488583168L;
        }
        d63 d63Var = (d63) vv1Var.f32887b;
        long j2 = vv1Var.f32886a;
        if (d63Var == null) {
            float fM3426d2 = b33.m3426d(j2);
            return b33.m3429g(vv1Var.f32886a, b33.m3431i((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) / fM3426d2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) / fM3426d2)) & 4294967295L), f));
        }
        float fM11991b = vv1Var.m11991b(j2) - (Math.signum(vv1Var.m11991b(vv1Var.f32886a)) * f);
        long j3 = vv1Var.f32886a;
        d63 d63Var2 = (d63) vv1Var.f32887b;
        d63 d63Var3 = d63.f16815b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (d63Var2 == d63Var3 ? j3 & 4294967295L : j3 >> 32));
        if (((d63) vv1Var.f32887b) == d63Var3) {
            return (((long) Float.floatToRawIntBits(fM11991b)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(fM11991b)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
    }

    /* JADX INFO: renamed from: b */
    public float m11991b(long j) {
        return Float.intBitsToFloat((int) (((d63) this.f32887b) == d63.f16815b ? j >> 32 : j & 4294967295L));
    }

    /* JADX INFO: renamed from: c */
    public uv1 m11992c() {
        ArrayList arrayList = new ArrayList(20);
        while (true) {
            String strMo3040y = ((k40) this.f32887b).mo3040y(this.f32886a);
            this.f32886a -= (long) strMo3040y.length();
            if (strMo3040y.length() == 0) {
                return new uv1((String[]) arrayList.toArray(new String[0]));
            }
            int iM6342h0 = hd4.m6342h0(strMo3040y, ':', 1, 4);
            if (iM6342h0 != -1) {
                String strSubstring = strMo3040y.substring(0, iM6342h0);
                String strSubstring2 = strMo3040y.substring(iM6342h0 + 1);
                arrayList.add(strSubstring);
                arrayList.add(hd4.m6360z0(strSubstring2).toString());
            } else if (strMo3040y.charAt(0) == ':') {
                String strSubstring3 = strMo3040y.substring(1);
                arrayList.add("");
                arrayList.add(hd4.m6360z0(strSubstring3).toString());
            } else {
                arrayList.add("");
                arrayList.add(hd4.m6360z0(strMo3040y).toString());
            }
        }
    }

    @Override // p000.y33
    /* JADX INFO: renamed from: g */
    public /* synthetic */ void mo141g(Exception exc) {
        tt2 tt2Var = (tt2) this.f32887b;
        ((AtomicLong) tt2Var.f31430d).set(this.f32886a);
    }

    public vv1(d63 d63Var) {
        this(0L, d63Var);
    }
}
