package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;

/* JADX INFO: renamed from: m6 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0898m6 implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f24676a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f24677b;

    public /* synthetic */ C0898m6(byte b) {
        this.f24676a = b;
    }

    @Override // p000.wp1
    public final Object invoke() {
        byte b = this.f24676a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return ((xz4) this.f24677b).m12798a();
            case 1:
                return Boolean.valueOf(((sp1) ((od1) this.f24677b).f26638c.invoke()).mo5772b());
            case 2:
                byte b2 = 2;
                lb5.m7910S((zo0) this.f24677b, null, null, new C0872lh(b2, null, b2), 3);
                return ju4Var;
            case 3:
                ArrayList arrayList = ((lr1) this.f24677b).f24306a;
                lw2 lw2Var = new lw2(arrayList.size());
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    uc2 uc2Var = (uc2) arrayList.get(i);
                    Object obj = uc2Var.f31783b;
                    int i2 = uc2Var.f31782a;
                    ev2.m5404a(lw2Var, obj != null ? new g92(Integer.valueOf(i2), uc2Var.f31783b) : Integer.valueOf(i2), uc2Var);
                }
                ev2 ev2Var = new ev2();
                ev2Var.f18514a = lw2Var;
                VarHandle.storeStoreFence();
                return ev2Var;
            case 4:
                ((yp1) this.f24677b).invoke(ju4Var);
                return ju4Var;
            default:
                return new ql0[((si1[]) this.f24677b).length];
        }
    }
}
