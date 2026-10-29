package p000;

import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vs2 {

    /* JADX INFO: renamed from: a */
    public nh3 f32830a;

    /* JADX INFO: renamed from: b */
    public jp0 f32831b;

    /* JADX INFO: renamed from: c */
    public HashMap f32832c;

    /* JADX INFO: renamed from: a */
    public final synchronized jp4 m11985a(String str) {
        if (this.f32832c.containsKey(str)) {
            return (jp4) this.f32832c.get(str);
        }
        CctBackendFactory cctBackendFactoryM8738E = this.f32830a.m8738E(str);
        if (cctBackendFactoryM8738E == null) {
            return null;
        }
        jp4 jp4VarCreate = cctBackendFactoryM8738E.create(this.f32831b.m7245p(str));
        this.f32832c.put(str, jp4VarCreate);
        return jp4VarCreate;
    }
}
