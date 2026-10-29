package p000;

import android.os.Bundle;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: yw */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1383yw extends C0007a6 implements InterfaceC1420zw {

    /* JADX INFO: renamed from: j */
    public final C0516c6 f35555j;

    /* JADX INFO: renamed from: k */
    public final List f35556k;

    /* JADX INFO: renamed from: l */
    public final y34 f35557l;

    /* JADX INFO: renamed from: m */
    public final boolean f35558m;

    public C1383yw(String str, LinkedHashSet linkedHashSet, String str2, LinkedHashMap linkedHashMap, Bundle bundle, HashSet hashSet, HashSet hashSet2, LinkedHashMap linkedHashMap2, String str3, C0516c6 c0516c6, List list, y34 y34Var, boolean z) {
        super(str, linkedHashSet, str2, linkedHashMap, bundle, hashSet, hashSet2, linkedHashMap2, str3);
        this.f35555j = c0516c6;
        this.f35556k = list;
        this.f35557l = y34Var;
        this.f35558m = z;
    }

    @Override // p000.InterfaceC1420zw
    /* JADX INFO: renamed from: a */
    public final List mo8884a() {
        return this.f35556k;
    }

    @Override // p000.InterfaceC1420zw
    /* JADX INFO: renamed from: h */
    public final y34 mo8891h() {
        return this.f35557l;
    }

    @Override // p000.InterfaceC1420zw
    /* JADX INFO: renamed from: i */
    public final C0516c6 mo8892i() {
        return this.f35555j;
    }

    @Override // p000.InterfaceC1420zw
    /* JADX INFO: renamed from: k */
    public final boolean mo8894k() {
        return this.f35558m;
    }
}
