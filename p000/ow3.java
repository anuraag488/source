package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ow3 implements w01 {

    /* JADX INFO: renamed from: a */
    public Object f27176a;

    /* JADX INFO: renamed from: b */
    public Object[] f27177b;

    @Override // p000.w01
    /* JADX INFO: renamed from: a */
    public final void mo3937a() {
        m9319b(qw3.f28853d, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m9319b(Object obj, Object[] objArr) {
        if (Arrays.equals(objArr, this.f27177b)) {
            return;
        }
        Object obj2 = this.f27176a;
        if (!(obj2 instanceof w01)) {
            obj2 = null;
        }
        w01 w01Var = (w01) obj2;
        if (w01Var != null) {
            w01Var.mo3937a();
        }
        Object obj3 = this.f27176a;
        if (!(obj3 instanceof pm3)) {
            obj3 = null;
        }
        pm3 pm3Var = (pm3) obj3;
        if (pm3Var != null) {
            pm3Var.mo41h();
        }
        this.f27176a = obj;
        this.f27177b = objArr;
        if (!(obj instanceof pm3)) {
            obj = null;
        }
        pm3 pm3Var2 = (pm3) obj;
        if (pm3Var2 != null) {
            pm3Var2.mo37c();
        }
    }
}
