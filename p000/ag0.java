package p000;

import android.app.Activity;
import android.app.PictureInPictureUiState;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.C0995R;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class ag0 extends Activity implements py4, ov1, av3, u33, cz2, lk2 {

    /* JADX INFO: renamed from: a */
    public final ok2 f14447a;

    /* JADX INFO: renamed from: b */
    public final zt1 f14448b;

    /* JADX INFO: renamed from: c */
    public final jp0 f14449c;

    /* JADX INFO: renamed from: d */
    public final pq3 f14450d;

    /* JADX INFO: renamed from: e */
    public oy4 f14451e;

    /* JADX INFO: renamed from: f */
    public final yf0 f14452f;

    /* JADX INFO: renamed from: g */
    public final dg4 f14453g;

    /* JADX INFO: renamed from: h */
    public final AtomicInteger f14454h;

    /* JADX INFO: renamed from: i */
    public final zf0 f14455i;

    /* JADX INFO: renamed from: j */
    public final CopyOnWriteArrayList f14456j;

    /* JADX INFO: renamed from: k */
    public final CopyOnWriteArrayList f14457k;

    /* JADX INFO: renamed from: l */
    public final CopyOnWriteArrayList f14458l;

    /* JADX INFO: renamed from: m */
    public final CopyOnWriteArrayList f14459m;

    /* JADX INFO: renamed from: n */
    public final CopyOnWriteArrayList f14460n;

    /* JADX INFO: renamed from: o */
    public final CopyOnWriteArrayList f14461o;

    /* JADX INFO: renamed from: p */
    public final CopyOnWriteArrayList f14462p;

    /* JADX INFO: renamed from: q */
    public boolean f14463q;

    /* JADX INFO: renamed from: r */
    public boolean f14464r;

    /* JADX INFO: renamed from: s */
    public final dg4 f14465s;

    /* JADX INFO: renamed from: t */
    public final dg4 f14466t;

    /* JADX INFO: renamed from: u */
    public final dg4 f14467u;

    public ag0() {
        byte b = 1;
        ok2 ok2Var = new ok2(this, true);
        this.f14447a = ok2Var;
        zt1 zt1Var = new zt1();
        this.f14448b = zt1Var;
        rf0 rf0Var = new rf0((byte) 0);
        rf0Var.f29221b = this;
        VarHandle.storeStoreFence();
        jp0 jp0Var = new jp0((byte) 29, false);
        jp0Var.f22482c = new CopyOnWriteArrayList();
        jp0Var.f22483d = new HashMap();
        jp0Var.f22481b = rf0Var;
        VarHandle.storeStoreFence();
        this.f14449c = jp0Var;
        g32 g32Var = new g32((byte) 20);
        g32Var.f19558b = this;
        VarHandle.storeStoreFence();
        zu3 zu3Var = new zu3();
        zu3Var.f36384a = this;
        zu3Var.f36385b = g32Var;
        zu3Var.f36386c = new r50((byte) 19);
        zu3Var.f36387d = new LinkedHashMap();
        zu3Var.f36391h = true;
        VarHandle.storeStoreFence();
        pq3 pq3Var = new pq3(b);
        pq3Var.f27896b = zu3Var;
        yu3 yu3Var = new yu3();
        yu3Var.f35540a = zu3Var;
        VarHandle.storeStoreFence();
        pq3Var.f27897c = yu3Var;
        VarHandle.storeStoreFence();
        this.f14450d = pq3Var;
        yf0 yf0Var = new yf0();
        yf0Var.f35192d = this;
        yf0Var.f35189a = SystemClock.uptimeMillis() + 10000;
        VarHandle.storeStoreFence();
        this.f14452f = yf0Var;
        sf0 sf0Var = new sf0(b);
        sf0Var.f30225b = this;
        VarHandle.storeStoreFence();
        this.f14453g = new dg4(sf0Var);
        this.f14454h = new AtomicInteger();
        zf0 zf0Var = new zf0();
        zf0Var.f36046h = this;
        zf0Var.f36039a = new LinkedHashMap();
        zf0Var.f36040b = new LinkedHashMap();
        zf0Var.f36041c = new LinkedHashMap();
        zf0Var.f36042d = new ArrayList();
        zf0Var.f36043e = new LinkedHashMap();
        zf0Var.f36044f = new LinkedHashMap();
        zf0Var.f36045g = new Bundle();
        VarHandle.storeStoreFence();
        this.f14455i = zf0Var;
        this.f14456j = new CopyOnWriteArrayList();
        this.f14457k = new CopyOnWriteArrayList();
        this.f14458l = new CopyOnWriteArrayList();
        this.f14459m = new CopyOnWriteArrayList();
        this.f14460n = new CopyOnWriteArrayList();
        this.f14461o = new CopyOnWriteArrayList();
        this.f14462p = new CopyOnWriteArrayList();
        sf0 sf0Var2 = new sf0((byte) 2);
        sf0Var2.f30225b = this;
        VarHandle.storeStoreFence();
        this.f14465s = new dg4(sf0Var2);
        uf0 uf0Var = new uf0(0 == true ? 1 : 0);
        uf0Var.f31819b = this;
        VarHandle.storeStoreFence();
        ok2Var.mo6015a(uf0Var);
        uf0 uf0Var2 = new uf0(b);
        uf0Var2.f31819b = this;
        VarHandle.storeStoreFence();
        ok2Var.mo6015a(uf0Var2);
        il3 il3Var = new il3(b);
        il3Var.f21532b = this;
        VarHandle.storeStoreFence();
        ok2Var.mo6015a(il3Var);
        pq3Var.m9607e();
        tu3.m11162b(this);
        vf0 vf0Var = new vf0(0 == true ? 1 : 0);
        vf0Var.f32563b = this;
        VarHandle.storeStoreFence();
        yu3Var.m13255c("android:support:activity-result", vf0Var);
        wf0 wf0Var = new wf0(0 == true ? 1 : 0);
        wf0Var.f33286b = this;
        VarHandle.storeStoreFence();
        if (((Context) zt1Var.f36357b) != null) {
            wf0Var.m12243a();
        }
        ((CopyOnWriteArraySet) zt1Var.f36356a).add(wf0Var);
        sf0 sf0Var3 = new sf0((byte) 3);
        sf0Var3.f30225b = this;
        VarHandle.storeStoreFence();
        this.f14466t = new dg4(sf0Var3);
        sf0 sf0Var4 = new sf0((byte) 4);
        sf0Var4.f30225b = this;
        VarHandle.storeStoreFence();
        this.f14467u = new dg4(sf0Var4);
    }

    /* JADX INFO: renamed from: f */
    public static final void m2973f(ag0 ag0Var) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!z62.m13387o(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!z62.m13387o(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    @Override // p000.cz2
    /* JADX INFO: renamed from: a */
    public final C1283w7 mo2974a() {
        return getOnBackPressedDispatcher().m10974b().f28978c;
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m2978e();
        this.f14452f.m13112a(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // p000.ov1
    /* JADX INFO: renamed from: b */
    public final gv2 mo2975b() {
        gv2 gv2Var = new gv2(0);
        if (getApplication() != null) {
            gv2Var.m6174a(ly4.f24472d, getApplication());
        }
        gv2Var.m6174a(tu3.f31456a, this);
        gv2Var.m6174a(tu3.f31457b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            gv2Var.m6174a(tu3.f31458c, extras);
        }
        return gv2Var;
    }

    @Override // p000.py4
    /* JADX INFO: renamed from: c */
    public final oy4 mo2976c() {
        if (getApplication() == null) {
            C1077qn.m9989o("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        oy4 oy4Var = this.f14451e;
        if (oy4Var != null) {
            return oy4Var;
        }
        xf0 xf0Var = (xf0) getLastNonConfigurationInstance();
        if (xf0Var != null) {
            this.f14451e = xf0Var.f34220a;
        }
        oy4 oy4Var2 = this.f14451e;
        if (oy4Var2 != null) {
            return oy4Var2;
        }
        oy4 oy4Var3 = new oy4();
        this.f14451e = oy4Var3;
        return oy4Var3;
    }

    /* JADX INFO: renamed from: d */
    public final void m2977d(wl0 wl0Var) {
        this.f14456j.add(wl0Var);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        int i = cy4.f16619a;
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        int i = cy4.f16619a;
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    /* JADX INFO: renamed from: e */
    public final void m2978e() {
        getWindow().getDecorView().setTag(C0995R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(C0995R.id.view_tree_view_model_store_owner, this);
        getWindow().getDecorView().setTag(C0995R.id.view_tree_saved_state_registry_owner, this);
        getWindow().getDecorView().setTag(C0995R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        getWindow().getDecorView().setTag(C0995R.id.report_drawn, this);
        getWindow().getDecorView().setTag(C0995R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    /* JADX INFO: renamed from: g */
    public final void m2979g(Bundle bundle) {
        super.onCreate(bundle);
        int i = wn3.f33519a;
        un3.m11588b(this);
    }

    @Override // p000.lk2
    public final gk2 getLifecycle() {
        return this.f14447a;
    }

    @Override // p000.u33
    public final t33 getOnBackPressedDispatcher() {
        return (t33) this.f14467u.getValue();
    }

    @Override // p000.av3
    public final yu3 getSavedStateRegistry() {
        return (yu3) this.f14450d.f27897c;
    }

    /* JADX INFO: renamed from: h */
    public final void m2980h(Bundle bundle) {
        this.f14447a.m9156h(fk2.f19056c);
        super.onSaveInstanceState(bundle);
    }

    /* JADX INFO: renamed from: i */
    public final C0638f5 m2981i(InterfaceC1355y4 interfaceC1355y4, C0006a5 c0006a5) {
        String str = "activity_rq#" + this.f14454h.getAndIncrement();
        zf0 zf0Var = this.f14455i;
        LinkedHashMap linkedHashMap = zf0Var.f36041c;
        ok2 ok2Var = this.f14447a;
        if (ok2Var.f26810h.m5728a(fk2.f19057d)) {
            StringBuilder sb = new StringBuilder("LifecycleOwner ");
            sb.append(this);
            fk2 fk2Var = ok2Var.f26810h;
            sb.append(" is attempting to register while current state is ");
            sb.append(fk2Var);
            sb.append(". LifecycleOwners must call register before they are STARTED.");
            throw new IllegalStateException(sb.toString().toString());
        }
        zf0Var.m13546d(str);
        C0599e5 c0599e5 = (C0599e5) linkedHashMap.get(str);
        if (c0599e5 == null) {
            c0599e5 = new C0599e5();
            c0599e5.f17690a = ok2Var;
            c0599e5.f17691b = new ArrayList();
            VarHandle.storeStoreFence();
        }
        C0479b5 c0479b5 = new C0479b5();
        c0479b5.f15080a = zf0Var;
        c0479b5.f15081b = str;
        c0479b5.f15082c = interfaceC1355y4;
        c0479b5.f15083d = c0006a5;
        VarHandle.storeStoreFence();
        c0599e5.f17690a.mo6015a(c0479b5);
        c0599e5.f17691b.add(c0479b5);
        linkedHashMap.put(str, c0599e5);
        C0638f5 c0638f5 = new C0638f5((byte) 0);
        c0638f5.f18765b = zf0Var;
        c0638f5.f18766c = str;
        c0638f5.f18767d = c0006a5;
        VarHandle.storeStoreFence();
        return c0638f5;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f14455i.m13543a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((uz0) this.f14465s.getValue()).m6971a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.f14456j.iterator();
        while (it.hasNext()) {
            ((wl0) it.next()).accept(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f14450d.m9608f(bundle);
        zt1 zt1Var = this.f14448b;
        zt1Var.f36357b = this;
        Iterator it = ((CopyOnWriteArraySet) zt1Var.f36356a).iterator();
        while (it.hasNext()) {
            ((wf0) it.next()).m12243a();
        }
        m2979g(bundle);
        int i = wn3.f33519a;
        un3.m11588b(this);
        getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f14449c.f22482c).iterator();
        while (it.hasNext()) {
            ((xn1) it.next()).f34458a.m5253l();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14449c.f22482c).iterator();
        while (it.hasNext()) {
            if (((xn1) it.next()).f34458a.m5258q()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.f14463q = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.f14463q = false;
            Iterator it = this.f14459m.iterator();
            while (it.hasNext()) {
                ((wl0) it.next()).accept(new fv2(z));
            }
        } catch (Throwable th) {
            this.f14463q = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.f14458l.iterator();
        while (it.hasNext()) {
            ((wl0) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.f14449c.f22482c).iterator();
        while (it.hasNext()) {
            ((xn1) it.next()).f34458a.m5259r();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.f14464r = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.f14464r = false;
            Iterator it = this.f14460n.iterator();
            while (it.hasNext()) {
                ((wl0) it.next()).accept(new za3(z));
            }
        } catch (Throwable th) {
            this.f14464r = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        q50 q50Var;
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        byte b = 14;
        if (Build.VERSION.SDK_INT >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            q50Var = new q50(b);
        } else {
            pictureInPictureUiState.isStashed();
            q50Var = new q50(b);
        }
        Iterator it = this.f14461o.iterator();
        while (it.hasNext()) {
            ((wl0) it.next()).accept(q50Var);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f14449c.f22482c).iterator();
        while (it.hasNext()) {
            ((xn1) it.next()).f34458a.m5262u();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.f14455i.m13543a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        xf0 xf0Var;
        oy4 oy4Var = this.f14451e;
        if (oy4Var == null && (xf0Var = (xf0) getLastNonConfigurationInstance()) != null) {
            oy4Var = xf0Var.f34220a;
        }
        if (oy4Var == null) {
            return null;
        }
        xf0 xf0Var2 = new xf0();
        xf0Var2.f34220a = oy4Var;
        return xf0Var2;
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        ok2 ok2Var = this.f14447a;
        if (ok2Var != null) {
            ok2Var.m9156h(fk2.f19056c);
        }
        m2980h(bundle);
        this.f14450d.m9609g(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.f14457k.iterator();
        while (it.hasNext()) {
            ((wl0) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f14462p.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (Trace.isEnabled()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            vp1 vp1Var = (vp1) this.f14453g.getValue();
            synchronized (vp1Var.f32768a) {
                try {
                    vp1Var.f32769b = true;
                    ArrayList arrayList = vp1Var.f32770c;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((wp1) obj).invoke();
                    }
                    vp1Var.f32770c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        m2978e();
        this.f14452f.m13112a(getWindow().getDecorView());
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        m2978e();
        this.f14452f.m13112a(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m2978e();
        this.f14452f.m13112a(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.f14463q) {
            return;
        }
        Iterator it = this.f14459m.iterator();
        while (it.hasNext()) {
            ((wl0) it.next()).accept(new fv2(z));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.f14464r) {
            return;
        }
        Iterator it = this.f14460n.iterator();
        while (it.hasNext()) {
            ((wl0) it.next()).accept(new za3(z));
        }
    }
}
