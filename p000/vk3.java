package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vk3 implements t20 {

    /* JADX INFO: renamed from: a */
    public final t20 f32701a;

    /* JADX INFO: renamed from: b */
    public final C0880lp f32702b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0520ca f32703c;

    /* JADX INFO: renamed from: d */
    public final jm0 f32704d;

    public vk3(t20 t20Var, C0880lp c0880lp, InterfaceC0520ca interfaceC0520ca, jm0 jm0Var) {
        this.f32701a = t20Var;
        this.f32702b = c0880lp;
        this.f32703c = interfaceC0520ca;
        this.f32704d = jm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vk3) {
            vk3 vk3Var = (vk3) obj;
            if (this.f32701a.equals(vk3Var.f32701a) && this.f32702b == vk3Var.f32702b && z62.m13387o(this.f32703c, vk3Var.f32703c) && z62.m13387o(this.f32704d, vk3Var.f32704d) && Float.compare(1.0f, 1.0f) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + c75.m3874f(1.0f, (this.f32704d.hashCode() + ((this.f32703c.hashCode() + ((this.f32702b.hashCode() + (this.f32701a.hashCode() * 31)) * 961)) * 31)) * 31, 961);
    }

    public final String toString() {
        return "RealSubcomposeAsyncImageScope(parentScope=" + this.f32701a + ", painter=" + this.f32702b + ", contentDescription=null, alignment=" + this.f32703c + ", contentScale=" + this.f32704d + ", alpha=1.0, colorFilter=null, clipToBounds=true)";
    }
}
