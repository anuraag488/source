package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class uv2 extends vp2 implements ec2 {

    /* JADX INFO: renamed from: d */
    public ma3 f32205d;

    /* JADX INFO: renamed from: e */
    public Object f32206e;

    @Override // p000.vp2, java.util.Map.Entry
    public final Object getValue() {
        return this.f32206e;
    }

    @Override // p000.vp2, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f32206e;
        this.f32206e = obj;
        ma3 ma3Var = this.f32205d;
        Object obj3 = this.f32772b;
        ka3 ka3Var = (ka3) ma3Var.f24786b;
        ja3 ja3Var = ka3Var.f23024d;
        if (!ja3Var.containsKey(obj3)) {
            return obj2;
        }
        boolean z = ka3Var.f21204c;
        if (!z) {
            ja3Var.put(obj3, obj);
        } else {
            if (!z) {
                xy4.m12795x();
                return null;
            }
            aq4 aq4Var = ka3Var.f21202a[ka3Var.f21203b];
            Object obj4 = aq4Var.f14778a[aq4Var.f14780c];
            ja3Var.put(obj3, obj);
            ka3Var.m7467c(obj4 != null ? obj4.hashCode() : 0, ja3Var.f22135c, obj4, 0);
        }
        ka3Var.f23027g = ja3Var.f22137e;
        return obj2;
    }
}
