package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class rm1 {

    /* JADX INFO: renamed from: a */
    public static final float[] f29410a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* JADX INFO: renamed from: b */
    public static volatile ra4 f29411b = new ra4(0);

    /* JADX INFO: renamed from: c */
    public static final Object[] f29412c;

    static {
        Object[] objArr = new Object[0];
        f29412c = objArr;
        synchronized (objArr) {
            f29411b.m10256c(115, new sm1(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f29411b.m10256c(130, new sm1(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f29411b.m10256c(150, new sm1(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f29411b.m10256c(180, new sm1(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f29411b.m10256c(200, new sm1(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((f29411b.m10255b(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        s32.m10515b("You should only apply non-linear scaling to font scales > 1");
    }

    /* JADX INFO: renamed from: a */
    public static qm1 m10370a(float f) {
        float fM10255b;
        qm1 sm1Var;
        float[] fArr = f29410a;
        if (f < 1.03f) {
            return null;
        }
        ra4 ra4Var = f29411b;
        int i = (int) (f * 100.0f);
        ra4Var.getClass();
        qm1 qm1Var = (qm1) sc6.m10680u(ra4Var, i);
        if (qm1Var != null) {
            return qm1Var;
        }
        ra4 ra4Var2 = f29411b;
        int iM10024h = qq2.m10024h(ra4Var2.f29119a, ra4Var2.f29121c, i);
        if (iM10024h >= 0) {
            return (qm1) f29411b.m10257d(iM10024h);
        }
        int i2 = -(iM10024h + 1);
        int i3 = i2 - 1;
        if (i2 >= f29411b.f29121c) {
            sm1 sm1Var2 = new sm1(new float[]{1.0f}, new float[]{f});
            m10371b(f, sm1Var2);
            return sm1Var2;
        }
        if (i3 < 0) {
            sm1Var = new sm1(fArr, fArr);
            fM10255b = 1.0f;
        } else {
            fM10255b = f29411b.m10255b(i3) / 100.0f;
            sm1Var = (qm1) f29411b.m10257d(i3);
        }
        float fM10255b2 = f29411b.m10255b(i2) / 100.0f;
        float fMax = (Math.max(0.0f, Math.min(1.0f, fM10255b == fM10255b2 ? 0.0f : (f - fM10255b) / (fM10255b2 - fM10255b))) * 1.0f) + 0.0f;
        qm1 qm1Var2 = (qm1) f29411b.m10257d(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f2 = fArr[i4];
            float fMo5730b = sm1Var.mo5730b(f2);
            fArr2[i4] = ((qm1Var2.mo5730b(f2) - fMo5730b) * fMax) + fMo5730b;
        }
        sm1 sm1Var3 = new sm1(fArr, fArr2);
        m10371b(f, sm1Var3);
        return sm1Var3;
    }

    /* JADX INFO: renamed from: b */
    public static void m10371b(float f, sm1 sm1Var) {
        synchronized (f29412c) {
            ra4 ra4VarM10254a = f29411b.clone();
            ra4VarM10254a.m10256c((int) (f * 100.0f), sm1Var);
            f29411b = ra4VarM10254a;
        }
    }
}
