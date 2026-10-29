package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bz3 implements mq1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ float f15704a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ma0 f15705b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ yp1 f15706c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ yp1 f15707d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ yp1 f15708e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ boolean f15709f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ z73 f15710g;

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        float f = this.f15704a;
        ma0 ma0Var = this.f15705b;
        yp1 yp1Var = this.f15706c;
        yp1 yp1Var2 = this.f15707d;
        yp1 yp1Var3 = this.f15708e;
        boolean z = this.f15709f;
        z73 z73Var = this.f15710g;
        mi0 mi0Var = (mi0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        ir1 ir1Var = (ir1) mi0Var;
        if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
            nt2 nt2VarM10048a = qr3.m10048a(AbstractC0647fd.m5653K(kt2.f23428a, 0.0f, 0.0f, 16.0f, 0.0f, 11), 1.0f);
            a84 a84Var = a84.f165a;
            nc4 nc4Var = pq2.f27894b;
            long j = ((lq2) ir1Var.m6898k(nc4Var)).f24277a.f16953j;
            long j2 = ((lq2) ir1Var.m6898k(nc4Var)).f24277a.f16953j;
            long jM9464c = pb0.m9464c(((lq2) ir1Var.m6898k(nc4Var)).f24277a.f16953j, 0.2f, 0.0f, 0.0f, 0.0f, 14);
            long j3 = pb0.f27501h;
            dc0 dc0Var = ((lq2) ir1Var.m6898k(nc4Var)).f24277a;
            u74 u74Var = dc0Var.f16945c0;
            if (u74Var == null) {
                u74Var = new u74(ic0.m6744d(dc0Var, 25), ic0.m6744d(dc0Var, 25), ic0.m6744d(dc0Var, 31), ic0.m6744d(dc0Var, 31), ic0.m6744d(dc0Var, 25), zy5.m13838B(pb0.m9464c(ic0.m6744d(dc0Var, 17), 0.38f, 0.0f, 0.0f, 0.0f, 14), dc0Var.f16959p), pb0.m9464c(ic0.m6744d(dc0Var, 17), 0.38f, 0.0f, 0.0f, 0.0f, 14), pb0.m9464c(ic0.m6744d(dc0Var, 17), 0.12f, 0.0f, 0.0f, 0.0f, 14), pb0.m9464c(ic0.m6744d(dc0Var, 17), 0.12f, 0.0f, 0.0f, 0.0f, 14), pb0.m9464c(ic0.m6744d(dc0Var, 17), 0.38f, 0.0f, 0.0f, 0.0f, 14));
                dc0Var.f16945c0 = u74Var;
            }
            long j4 = j != 16 ? j : u74Var.f31699a;
            if (j2 == r4) {
                j2 = u74Var.f31700b;
            }
            long j5 = j2;
            long j6 = j3 != r4 ? j3 : u74Var.f31701c;
            if (jM9464c == 16) {
                jM9464c = u74Var.f31702d;
            }
            long j7 = jM9464c;
            long j8 = j3 != r4 ? j3 : u74Var.f31703e;
            long j9 = j3 != r4 ? j3 : u74Var.f31704f;
            long j10 = j3 != r4 ? j3 : u74Var.f31705g;
            long j11 = j3 != r4 ? j3 : u74Var.f31706h;
            long j12 = j3 != r4 ? j3 : u74Var.f31707i;
            if (j3 == r4) {
                j3 = u74Var.f31708j;
            }
            u74 u74Var2 = new u74(j4, j5, j6, j7, j8, j9, j10, j11, j12, j3);
            boolean zM6890g = ir1Var.m6890g(yp1Var);
            Object objM6869O = ir1Var.m6869O();
            if (zM6890g || objM6869O == ki0.f23136a) {
                obj3 = objM6869O;
                cz3 cz3Var = new cz3((byte) 0);
                cz3Var.f16638b = yp1Var;
                cz3Var.f16639c = z73Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(cz3Var);
                obj3 = cz3Var;
            }
            obj3 = objM6869O;
            ks5.m7601b(f, nt2VarM10048a, ma0Var, (yp1) obj3, yp1Var2, yp1Var3, z, null, u74Var2, ir1Var, 0);
        } else {
            ir1Var.m6874W();
        }
        return ju4.f22634a;
    }
}
