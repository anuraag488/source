package p000;

import java.lang.invoke.VarHandle;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zv0 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public nl3 f36401t;

    /* JADX INFO: renamed from: u */
    public C0457ak f36402u;

    /* JADX INFO: renamed from: v */
    public boolean f36403v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ float f36404w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ aw0 f36405x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ tx3 f36406y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv0(float f, aw0 aw0Var, tx3 tx3Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f36404w = f;
        this.f36405x = aw0Var;
        this.f36406y = tx3Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        return new zv0(this.f36404w, this.f36405x, this.f36406y, wm0Var);
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        return ((zv0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4.f22634a);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        float f;
        C0457ak c0457ak;
        nl3 nl3Var;
        ap0 ap0Var = ap0.f14763a;
        boolean z = this.f36403v;
        if (!z) {
            k43.m7376J(obj);
            f = this.f36404w;
            if (Math.abs(f) > 1.0f) {
                nl3 nl3Var2 = new nl3();
                nl3Var2.f25933a = f;
                nl3 nl3Var3 = new nl3();
                C0457ak c0457akM7379a = k43.m7379a(0.0f, f, 28);
                try {
                    aw0 aw0Var = this.f36405x;
                    gv0 gv0Var = aw0Var.f14909a;
                    tx3 tx3Var = this.f36406y;
                    C0762ii c0762ii = new C0762ii((byte) 4);
                    c0762ii.f21430b = nl3Var3;
                    c0762ii.f21431c = tx3Var;
                    c0762ii.f21432d = nl3Var2;
                    c0762ii.f21433e = aw0Var;
                    VarHandle.storeStoreFence();
                    this.f36401t = nl3Var2;
                    this.f36402u = c0457akM7379a;
                    this.f36403v = true;
                    if (qs5.m10105j(c0457akM7379a, gv0Var, false, c0762ii, this) == ap0Var) {
                        return ap0Var;
                    }
                    nl3Var = nl3Var2;
                    f = nl3Var.f25933a;
                } catch (CancellationException unused) {
                    c0457ak = c0457akM7379a;
                    nl3Var = nl3Var2;
                    nl3Var.f25933a = ((Number) c0457ak.m3020a()).floatValue();
                }
            }
        } else {
            if (!z) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c0457ak = this.f36402u;
            nl3Var = this.f36401t;
            try {
                k43.m7376J(obj);
            } catch (CancellationException unused2) {
                nl3Var.f25933a = ((Number) c0457ak.m3020a()).floatValue();
            }
            f = nl3Var.f25933a;
        }
        return new Float(f);
    }
}
