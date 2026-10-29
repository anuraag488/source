package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mg0 implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f24877a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ int f24878b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f24879c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f24880d;

    public /* synthetic */ mg0(byte b) {
        this.f24877a = b;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        byte b = this.f24877a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                pg0 pg0Var = (pg0) this.f24879c;
                Object obj3 = this.f24880d;
                int i = this.f24878b;
                ((Integer) obj2).getClass();
                pg0Var.m9514e(obj3, (mi0) obj, vd6.m11838V(i) | 1);
                break;
            case 1:
                zh3 zh3Var = (zh3) this.f24879c;
                mq1 mq1Var = (mq1) this.f24880d;
                int i2 = this.f24878b;
                ((Integer) obj2).intValue();
                as4.m3244c(zh3Var, mq1Var, (mi0) obj, vd6.m11838V(i2 | 1));
                break;
            case 2:
                zh3[] zh3VarArr = (zh3[]) this.f24879c;
                mq1 mq1Var2 = (mq1) this.f24880d;
                int i3 = this.f24878b;
                ((Integer) obj2).getClass();
                as4.m3245d(zh3VarArr, mq1Var2, (mi0) obj, vd6.m11838V(i3 | 1));
                break;
            case 3:
                hd1 hd1Var = (hd1) this.f24879c;
                mq1 mq1Var3 = (mq1) this.f24880d;
                int i4 = this.f24878b;
                ((Integer) obj2).getClass();
                pd1.m9498c(hd1Var, mq1Var3, (mi0) obj, vd6.m11838V(i4 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                zy5.m13874i(this.f24878b, (vx2) this.f24879c, (nt2) this.f24880d, (mi0) obj, vd6.m11838V(1));
                break;
            default:
                dp4 dp4Var = (dp4) this.f24879c;
                Object obj4 = this.f24880d;
                int i5 = this.f24878b;
                ((Integer) obj2).intValue();
                dp4Var.m4639a(obj4, (mi0) obj, vd6.m11838V(i5 | 1));
                break;
        }
        return ju4Var;
    }
}
