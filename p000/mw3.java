package p000;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mw3 implements w01 {

    /* JADX INFO: renamed from: a */
    public final HashMap f25263a = new HashMap();

    @Override // p000.w01
    /* JADX INFO: renamed from: a */
    public final void mo3937a() {
        HashMap map = this.f25263a;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (!(value instanceof w01)) {
                value = null;
            }
            w01 w01Var = (w01) value;
            if (w01Var != null) {
                w01Var.mo3937a();
            }
        }
        map.clear();
    }
}
