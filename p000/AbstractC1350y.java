package p000;

import ads_mobile_sdk.kh3;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: y */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1350y implements InterfaceC0618en {

    /* JADX INFO: renamed from: a */
    public final Object f34752a;

    /* JADX INFO: renamed from: b */
    public Object f34753b;

    /* JADX INFO: renamed from: c */
    public final Object f34754c;

    public AbstractC1350y(Object obj) {
        this.f34752a = obj;
        this.f34754c = new ArrayList();
        this.f34753b = obj;
    }

    /* JADX INFO: renamed from: a */
    public static l73 m12807a(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (((ua5) entry.getValue()).mo621k()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            } else {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        return new l73(linkedHashMap, linkedHashMap2);
    }

    @Override // p000.InterfaceC0618en
    public void clear() {
        ((ArrayList) this.f34754c).clear();
        this.f34753b = this.f34752a;
        mo7631f();
    }

    @Override // p000.InterfaceC0618en
    /* JADX INFO: renamed from: d */
    public void mo4827d(Object obj) {
        ((ArrayList) this.f34754c).add(this.f34753b);
        this.f34753b = obj;
    }

    /* JADX INFO: renamed from: f */
    public void mo7631f() {
        ((wf2) this.f34752a).m12264R();
    }

    @Override // p000.InterfaceC0618en
    /* JADX INFO: renamed from: n */
    public Object mo4832n() {
        return this.f34753b;
    }

    @Override // p000.InterfaceC0618en
    /* JADX INFO: renamed from: u */
    public void mo4835u() {
        ArrayList arrayList = (ArrayList) this.f34754c;
        this.f34753b = arrayList.remove(arrayList.size() - 1);
    }

    public AbstractC1350y(zo0 zo0Var, Map map, kh3 kh3Var) {
        this.f34752a = zo0Var;
        this.f34753b = map;
        this.f34754c = kh3Var;
    }
}
