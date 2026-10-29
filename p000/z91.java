package p000;

import java.io.ByteArrayOutputStream;
import java.lang.invoke.VarHandle;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class z91 {

    /* JADX INFO: renamed from: a */
    public HashMap f35879a;

    /* JADX INFO: renamed from: b */
    public HashMap f35880b;

    /* JADX INFO: renamed from: a */
    public void m13454a(Enum r2, Object obj) {
        this.f35879a.put(r2, obj);
        this.f35880b.put(obj, r2);
    }

    /* JADX INFO: renamed from: b */
    public wf3 m13455b() {
        wf3 wf3Var = new wf3();
        wf3Var.f33337a = new HashMap(this.f35879a);
        wf3Var.f33338b = new HashMap(this.f35880b);
        VarHandle.storeStoreFence();
        return wf3Var;
    }

    /* JADX INFO: renamed from: c */
    public nh3 m13456c() {
        Map mapUnmodifiableMap = Collections.unmodifiableMap(this.f35879a);
        Map mapUnmodifiableMap2 = Collections.unmodifiableMap(this.f35880b);
        nh3 nh3Var = new nh3((byte) 15, false);
        nh3Var.f25810b = mapUnmodifiableMap;
        nh3Var.f25811c = mapUnmodifiableMap2;
        VarHandle.storeStoreFence();
        return nh3Var;
    }

    /* JADX INFO: renamed from: d */
    public void m13457d(ea0 ea0Var, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = this.f35879a;
        HashMap map2 = this.f35880b;
        t92 t92Var = qq2.f28688g;
        uh3 uh3Var = new uh3();
        vh3 vh3Var = new vh3();
        vh3Var.f32620a = false;
        vh3Var.f32621b = false;
        vh3Var.f32623d = uh3Var;
        VarHandle.storeStoreFence();
        uh3Var.f31877e = vh3Var;
        uh3Var.f31873a = byteArrayOutputStream;
        uh3Var.f31874b = map;
        uh3Var.f31875c = map2;
        uh3Var.f31876d = t92Var;
        VarHandle.storeStoreFence();
        m23 m23Var = (m23) map.get(ea0.class);
        if (m23Var != null) {
            m23Var.mo3114a(ea0Var, uh3Var);
        } else {
            throw new k81("No encoder for " + ea0.class);
        }
    }
}
