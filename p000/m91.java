package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class m91 extends ue2 implements yp1 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ byte f24764i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ o91 f24765j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ long f24766k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m91(o91 o91Var, long j, byte b) {
        super(1);
        this.f24764i = b;
        this.f24765j = o91Var;
        this.f24766k = j;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        yp1 yp1Var;
        yp1 yp1Var2;
        yp1 yp1Var3;
        yp1 yp1Var4;
        int iOrdinal;
        byte b = this.f24764i;
        long j = this.f24766k;
        long jM8957d = 0;
        o91 o91Var = this.f24765j;
        switch (b) {
            case 0:
                int iOrdinal2 = ((b91) obj).ordinal();
                if (iOrdinal2 == 0) {
                    z70 z70Var = o91Var.f26483s.f27464a.f16336c;
                    if (z70Var != null && (yp1Var = z70Var.f35800b) != null) {
                        j = ((w52) yp1Var.invoke(w52.m12106a(j))).f33109a;
                    }
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        C0670g.m5864c();
                        return null;
                    }
                    z70 z70Var2 = o91Var.f26484t.f24813a.f16336c;
                    if (z70Var2 != null && (yp1Var2 = z70Var2.f35800b) != null) {
                        j = ((w52) yp1Var2.invoke(w52.m12106a(j))).f33109a;
                    }
                }
                return w52.m12106a(j);
            case 1:
                b91 b91Var = (b91) obj;
                if (b91Var == b91.f15170c && o91Var.f26484t.f24813a.f16335b == null) {
                    jM8957d = o91Var.f26485u.f15097i;
                } else {
                    t74 t74Var = o91Var.f26483s.f27464a.f16335b;
                    long j2 = (t74Var == null || (yp1Var4 = t74Var.f30976a) == null) ? 0L : ((o52) yp1Var4.invoke(w52.m12106a(j))).f26352a;
                    t74 t74Var2 = o91Var.f26484t.f24813a.f16335b;
                    long j3 = (t74Var2 == null || (yp1Var3 = t74Var2.f30976a) == null) ? 0L : ((o52) yp1Var3.invoke(w52.m12106a(j))).f26352a;
                    int iOrdinal3 = b91Var.ordinal();
                    if (iOrdinal3 == 0) {
                        jM8957d = j2;
                    } else if (iOrdinal3 != 1) {
                        if (iOrdinal3 != 2) {
                            C0670g.m5864c();
                            return null;
                        }
                        jM8957d = j3;
                    }
                }
                return o52.m8954a(jM8957d);
            default:
                b91 b91Var2 = (b91) obj;
                if (o91Var.f26489y != null && o91Var.m9005O0() != null && !z62.m13387o(o91Var.f26489y, o91Var.m9005O0()) && (iOrdinal = b91Var2.ordinal()) != 0 && iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        C0670g.m5864c();
                        return null;
                    }
                    z70 z70Var3 = o91Var.f26484t.f24813a.f16336c;
                    if (z70Var3 != null) {
                        yp1 yp1Var5 = z70Var3.f35800b;
                        long j4 = this.f24766k;
                        long j5 = ((w52) yp1Var5.invoke(w52.m12106a(j4))).f33109a;
                        InterfaceC0520ca interfaceC0520caM9005O0 = o91Var.m9005O0();
                        df2 df2Var = df2.f17011a;
                        jM8957d = o52.m8957d(interfaceC0520caM9005O0.mo3927a(j4, j5, df2Var), o91Var.f26489y.mo3927a(j4, j5, df2Var));
                    }
                }
                return o52.m8954a(jM8957d);
        }
    }
}
