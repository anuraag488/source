package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vv5 {

    /* JADX INFO: renamed from: a */
    public final Object f32890a;

    /* JADX INFO: renamed from: b */
    public final Object f32891b;

    /* JADX INFO: renamed from: c */
    public final Object f32892c;

    public vv5(Object obj, Object obj2, Object obj3) {
        this.f32890a = obj;
        this.f32891b = obj2;
        this.f32892c = obj3;
    }

    /* JADX INFO: renamed from: a */
    public final IllegalArgumentException m11997a() {
        Object obj = this.f32890a;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.f32891b);
        return new IllegalArgumentException(c75.m3881m(zi4.m13625y("Multiple entries with same key: ", strValueOf, "=", strValueOf2, " and "), String.valueOf(obj), "=", String.valueOf(this.f32892c)));
    }
}
