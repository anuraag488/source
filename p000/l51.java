package p000;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class l51 extends gp2 {

    /* JADX INFO: renamed from: a */
    public C0641f8 f23792a;

    /* JADX INFO: renamed from: b */
    public k51 f23793b;

    /* JADX INFO: renamed from: c */
    public C0973o7 f23794c;

    /* JADX INFO: renamed from: d */
    public C0973o7 f23795d;

    /* JADX INFO: renamed from: b */
    public static C1283w7 m7834b() {
        C1283w7 c1283w7 = new C1283w7((byte) 9);
        c1283w7.f33127c = null;
        c1283w7.f33128d = null;
        c1283w7.f33129e = null;
        c1283w7.f33126b = C0973o7.f26396v;
        return c1283w7;
    }

    @Override // p000.t73
    /* JADX INFO: renamed from: a */
    public final boolean mo5593a() {
        return this.f23795d != C0973o7.f26396v;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l51)) {
            return false;
        }
        l51 l51Var = (l51) obj;
        return l51Var.f23792a == this.f23792a && l51Var.f23793b == this.f23793b && l51Var.f23794c == this.f23794c && l51Var.f23795d == this.f23795d;
    }

    public final int hashCode() {
        return Objects.hash(l51.class, this.f23792a, this.f23793b, this.f23794c, this.f23795d);
    }

    public final String toString() {
        return "ECDSA Parameters (variant: " + this.f23795d + ", hashType: " + this.f23794c + ", encoding: " + this.f23792a + ", curve: " + this.f23793b + ")";
    }
}
