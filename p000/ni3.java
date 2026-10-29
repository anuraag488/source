package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ni3 {

    /* JADX INFO: renamed from: a */
    public final Class f25871a;

    /* JADX INFO: renamed from: b */
    public final Class f25872b;

    public ni3(Class cls, Class cls2) {
        this.f25871a = cls;
        this.f25872b = cls2;
    }

    /* JADX INFO: renamed from: a */
    public static ni3 m8779a(Class cls) {
        return new ni3(mi3.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ni3.class != obj.getClass()) {
            return false;
        }
        ni3 ni3Var = (ni3) obj;
        if (this.f25872b.equals(ni3Var.f25872b)) {
            return this.f25871a.equals(ni3Var.f25871a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f25871a.hashCode() + (this.f25872b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f25872b;
        Class cls2 = this.f25871a;
        if (cls2 == mi3.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
