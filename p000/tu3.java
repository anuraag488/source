package p000;

import android.os.Bundle;
import java.lang.invoke.VarHandle;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class tu3 {

    /* JADX INFO: renamed from: a */
    public static final f70 f31456a = new f70(16);

    /* JADX INFO: renamed from: b */
    public static final h50 f31457b = new h50(17);

    /* JADX INFO: renamed from: c */
    public static final i50 f31458c = new i50((byte) 17);

    /* JADX INFO: renamed from: a */
    public static final qu3 m11161a(gv2 gv2Var) {
        LinkedHashMap linkedHashMap = gv2Var.f17298a;
        av3 av3Var = (av3) linkedHashMap.get(f31456a);
        Bundle bundle = null;
        if (av3Var == null) {
            C1077qn.m9987m("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        py4 py4Var = (py4) linkedHashMap.get(f31457b);
        if (py4Var == null) {
            C1077qn.m9987m("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle2 = (Bundle) linkedHashMap.get(f31458c);
        String str = (String) linkedHashMap.get(js1.f22553c);
        if (str == null) {
            C1077qn.m9987m("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        xu3 xu3VarM13254b = av3Var.getSavedStateRegistry().m13254b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        uu3 uu3Var = xu3VarM13254b instanceof uu3 ? (uu3) xu3VarM13254b : null;
        if (uu3Var == null) {
            C1077qn.m9989o("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        LinkedHashMap linkedHashMap2 = m11163c(py4Var).f32880b;
        qu3 qu3Var = (qu3) linkedHashMap2.get(str);
        if (qu3Var != null) {
            return qu3Var;
        }
        uu3Var.m11649b();
        Bundle bundle3 = uu3Var.f32189c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = kx5.m7742x((l73[]) Arrays.copyOf(new l73[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                uu3Var.f32189c = null;
            }
            bundle = bundle4;
        }
        qu3 qu3VarM10734o = se0.m10734o(bundle, bundle2);
        linkedHashMap2.put(str, qu3VarM10734o);
        return qu3VarM10734o;
    }

    /* JADX INFO: renamed from: b */
    public static final void m11162b(av3 av3Var) {
        fk2 fk2VarMo6016b = av3Var.getLifecycle().mo6016b();
        if (fk2VarMo6016b != fk2.f19055b && fk2VarMo6016b != fk2.f19056c) {
            xy4.m12784m("Failed to enable `SavedStateHandle` for `", av3Var, "`. The `Lifecycle.State` must be `INITIALIZED` or `CREATED`, but was `", fk2VarMo6016b, "`. You must call `enableSavedStateHandles()` before the `Lifecycle.State` moves to `STARTED`.");
            return;
        }
        if (av3Var.getSavedStateRegistry().m13254b("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            yu3 savedStateRegistry = av3Var.getSavedStateRegistry();
            uu3 uu3Var = new uu3();
            uu3Var.f32187a = savedStateRegistry;
            g32 g32Var = new g32((byte) 19);
            g32Var.f19558b = (py4) av3Var;
            VarHandle.storeStoreFence();
            uu3Var.f32190d = new dg4(g32Var);
            VarHandle.storeStoreFence();
            av3Var.getSavedStateRegistry().m13255c("androidx.lifecycle.internal.SavedStateHandlesProvider", uu3Var);
            gk2 lifecycle = av3Var.getLifecycle();
            il3 il3Var = new il3((byte) 4);
            il3Var.f21532b = uu3Var;
            VarHandle.storeStoreFence();
            lifecycle.mo6015a(il3Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final vu3 m11163c(py4 py4Var) {
        return (vu3) ((C1283w7) new js1(py4Var.mo2976c(), new su3(), py4Var instanceof ov1 ? ((ov1) py4Var).mo2975b() : br0.f15519b).f22555a).m12122I(rl3.m10361a(vu3.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
