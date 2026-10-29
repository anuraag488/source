package p000;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import org.chromium.net.C0995R;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class eg0 extends Dialog implements lk2, u33, cz2, av3 {

    /* JADX INFO: renamed from: a */
    public ok2 f18063a;

    /* JADX INFO: renamed from: b */
    public pq3 f18064b;

    /* JADX INFO: renamed from: c */
    public dg4 f18065c;

    /* JADX INFO: renamed from: d */
    public dg4 f18066d;

    /* JADX INFO: renamed from: d */
    public static final void m5120d(eg0 eg0Var) {
        super.onBackPressed();
    }

    @Override // p000.cz2
    /* JADX INFO: renamed from: a */
    public final C1283w7 mo2974a() {
        return getOnBackPressedDispatcher().m10974b().f28978c;
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m5122c();
        super.addContentView(view, layoutParams);
    }

    /* JADX INFO: renamed from: b */
    public final ok2 m5121b() {
        ok2 ok2Var = this.f18063a;
        if (ok2Var != null) {
            return ok2Var;
        }
        ok2 ok2Var2 = new ok2(this, true);
        this.f18063a = ok2Var2;
        return ok2Var2;
    }

    /* JADX INFO: renamed from: c */
    public final void m5122c() {
        getWindow().getDecorView().setTag(C0995R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(C0995R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        getWindow().getDecorView().setTag(C0995R.id.view_tree_saved_state_registry_owner, this);
        getWindow().getDecorView().setTag(C0995R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // p000.lk2
    public final gk2 getLifecycle() {
        return m5121b();
    }

    @Override // p000.u33
    public final t33 getOnBackPressedDispatcher() {
        return (t33) this.f18066d.getValue();
    }

    @Override // p000.av3
    public final yu3 getSavedStateRegistry() {
        return (yu3) this.f18064b.f27897c;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((uz0) this.f18065c.getValue()).m6971a();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getOnBackPressedDispatcher().m10976d(getOnBackInvokedDispatcher());
        this.f18064b.m9608f(bundle);
        m5121b().m9154f(ek2.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        this.f18064b.m9609g(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        m5121b().m9154f(ek2.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        m5121b().m9154f(ek2.ON_DESTROY);
        this.f18063a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public final void setContentView(int i) {
        m5122c();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        m5122c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m5122c();
        super.setContentView(view, layoutParams);
    }
}
