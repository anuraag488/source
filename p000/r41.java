package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r41 implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f28991a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ dc0 f28992b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ lu2 f28993c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ s44 f28994d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ js4 f28995e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ mq1 f28996f;

    public /* synthetic */ r41(byte b) {
        this.f28991a = b;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f28991a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                dc0 dc0Var = this.f28992b;
                lu2 lu2Var = this.f28993c;
                s44 s44Var = this.f28994d;
                js4 js4Var = this.f28995e;
                mq1 mq1Var = this.f28996f;
                mi0 mi0Var = (mi0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ir1 ir1Var = (ir1) mi0Var;
                if (!ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ir1Var.m6874W();
                } else {
                    pq2.m9598a(dc0Var, lu2Var, s44Var, js4Var, mq1Var, ir1Var, 0);
                }
                break;
            default:
                dc0 dc0VarM6746f = this.f28992b;
                lu2 lu2Var2 = this.f28993c;
                s44 s44Var2 = this.f28994d;
                js4 js4Var2 = this.f28995e;
                mq1 mq1Var2 = this.f28996f;
                mi0 mi0Var2 = (mi0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ir1 ir1Var2 = (ir1) mi0Var2;
                if (!ir1Var2.m6871T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ir1Var2.m6874W();
                } else {
                    if (dc0VarM6746f == null) {
                        nc4 nc4Var = ic0.f21254a;
                        dc0VarM6746f = ic0.m6746f(0L, 0L, 0L, zy5.m13871f(79, 55, 139), 0L, 0L, 0L, 0L, zy5.m13871f(74, 68, 88), 0L, 0L, 0L, zy5.m13871f(99, 59, 72), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, zy5.m13871f(140, 29, 24), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -33558793, 65535);
                    }
                    dc0 dc0Var2 = dc0VarM6746f;
                    if (lu2Var2 == null) {
                        lu2Var2 = ju2.f22627a;
                    }
                    lu2 lu2Var3 = lu2Var2;
                    if (s44Var2 == null) {
                        s44Var2 = new s44();
                    }
                    s44 s44Var3 = s44Var2;
                    if (js4Var2 == null) {
                        js4Var2 = new js4();
                    }
                    pq2.m9599b(dc0Var2, lu2Var3, s44Var3, js4Var2, mq1Var2, ir1Var2, 0);
                }
                break;
        }
        return ju4Var;
    }
}
