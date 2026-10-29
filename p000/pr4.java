package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pr4 implements vq4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f27920a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f27921b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ uq4 f27922c;

    public /* synthetic */ pr4(byte b) {
        this.f27920a = b;
    }

    @Override // p000.vq4
    /* JADX INFO: renamed from: a */
    public final uq4 mo3628a(ou1 ou1Var, cs4 cs4Var) {
        switch (this.f27920a) {
            case 0:
                if (cs4Var.f16429a == ((Class) this.f27921b)) {
                    return this.f27922c;
                }
                return null;
            case 1:
                Class<?> cls = cs4Var.f16429a;
                if (!((Class) this.f27921b).isAssignableFrom(cls)) {
                    return null;
                }
                fb0 fb0Var = new fb0((byte) 1);
                fb0Var.f18889c = this;
                fb0Var.f18888b = cls;
                VarHandle.storeStoreFence();
                return fb0Var;
            default:
                if (cs4Var.equals((cs4) this.f27921b)) {
                    return this.f27922c;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f27920a) {
            case 0:
                return "Factory[type=" + ((Class) this.f27921b).getName() + ",adapter=" + this.f27922c + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.f27921b).getName() + ",adapter=" + this.f27922c + "]";
            default:
                return super.toString();
        }
    }
}
