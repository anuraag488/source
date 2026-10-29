package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fa3 extends ja3 {

    /* JADX INFO: renamed from: g */
    public ga3 f18880g;

    @Override // p000.ja3, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof xh3) {
            return super.containsKey((xh3) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof nw4) {
            return super.containsValue((nw4) obj);
        }
        return false;
    }

    @Override // p000.ja3
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final ga3 mo5625b() {
        zp4 zp4Var = this.f22135c;
        ga3 ga3Var = this.f18880g;
        if (zp4Var != ga3Var.f20460a) {
            this.f22134b = new q50((byte) 13);
            ga3Var = new ga3(this.f22135c, this.f22138f);
        }
        this.f18880g = ga3Var;
        return ga3Var;
    }

    @Override // p000.ja3, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof xh3) {
            return (nw4) super.get((xh3) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof xh3) ? obj2 : (nw4) super.getOrDefault((xh3) obj, (nw4) obj2);
    }

    @Override // p000.ja3, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof xh3) {
            return (nw4) super.remove((xh3) obj);
        }
        return null;
    }
}
