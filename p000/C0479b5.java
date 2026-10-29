package p000;

import android.os.Bundle;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: b5 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0479b5 implements jk2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ zf0 f15080a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ String f15081b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ InterfaceC1355y4 f15082c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ C0006a5 f15083d;

    @Override // p000.jk2
    /* JADX INFO: renamed from: b */
    public final void mo3449b(lk2 lk2Var, ek2 ek2Var) {
        zf0 zf0Var = this.f15080a;
        String str = this.f15081b;
        InterfaceC1355y4 interfaceC1355y4 = this.f15082c;
        C0006a5 c0006a5 = this.f15083d;
        if (ek2.ON_START != ek2Var) {
            if (ek2.ON_STOP == ek2Var) {
                zf0Var.f36043e.remove(str);
                return;
            } else {
                if (ek2.ON_DESTROY == ek2Var) {
                    zf0Var.m13547e(str);
                    return;
                }
                return;
            }
        }
        LinkedHashMap linkedHashMap = zf0Var.f36043e;
        Bundle bundle = zf0Var.f36045g;
        LinkedHashMap linkedHashMap2 = zf0Var.f36044f;
        linkedHashMap.put(str, new C0563d5(interfaceC1355y4, c0006a5));
        if (linkedHashMap2.containsKey(str)) {
            Object obj = linkedHashMap2.get(str);
            linkedHashMap2.remove(str);
            interfaceC1355y4.mo7271b(obj);
        }
        C1318x4 c1318x4 = (C1318x4) zt5.m13791x(str, bundle);
        if (c1318x4 != null) {
            bundle.remove(str);
            interfaceC1355y4.mo7271b(new C1318x4(c1318x4.f33969b, c1318x4.f33968a));
        }
    }
}
