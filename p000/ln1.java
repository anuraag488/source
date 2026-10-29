package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ln1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f24196a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ pn1 f24197b;

    public /* synthetic */ ln1(byte b) {
        this.f24196a = b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f24196a;
        pn1 pn1Var = this.f24197b;
        switch (b) {
            case 0:
                pn1Var.f27769N.m9154f(ek2.ON_DESTROY);
                break;
            case 1:
                pn1Var.f27760E = true;
                break;
            case 2:
                pn1Var.mo8905p();
                break;
            case 3:
                pn1Var.f27760E = true;
                break;
            case 4:
                pn1Var.f27769N.m9154f(ek2.ON_RESUME);
                break;
            case 5:
                pn1Var.mo8904o();
                break;
            case 6:
                pn1Var.f27769N.m9154f(ek2.ON_CREATE);
                break;
            case 7:
                qo1 qo1Var = pn1Var.f27771P;
                qo1Var.f28638e.m9608f(pn1Var.f27781d);
                pn1Var.f27781d = null;
                break;
            case 8:
                pn1Var.f27769N.m9154f(ek2.ON_STOP);
                break;
            case 9:
                pn1Var.mo8909t();
                break;
            case 10:
                pn1Var.f27760E = true;
                break;
            case 11:
                pn1Var.mo8908s();
                break;
            case 12:
                pn1Var.f27769N.m9154f(ek2.ON_START);
                break;
            case 13:
                pn1Var.mo8902m(pn1Var.f27798u.f29431v);
                break;
            case 14:
                pn1Var.f27769N.m9154f(ek2.ON_PAUSE);
                break;
            default:
                pn1Var.f27760E = true;
                break;
        }
    }
}
