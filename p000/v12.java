package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class v12 {

    /* JADX INFO: renamed from: a */
    public final Object f32304a;

    /* JADX INFO: renamed from: b */
    public final Object f32305b;

    /* JADX INFO: renamed from: c */
    public final Object f32306c;

    public v12(Object obj, Object obj2, Object obj3) {
        this.f32304a = obj;
        this.f32305b = obj2;
        this.f32306c = obj3;
    }

    /* JADX INFO: renamed from: a */
    public final IllegalArgumentException m11694a() {
        StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f32304a;
        sb.append(obj);
        sb.append("=");
        sb.append(this.f32305b);
        sb.append(" and ");
        sb.append(obj);
        sb.append("=");
        sb.append(this.f32306c);
        return new IllegalArgumentException(sb.toString());
    }
}
