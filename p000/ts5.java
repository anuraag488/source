package p000;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.view.Window;
import java.lang.invoke.VarHandle;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ts5 {

    /* JADX INFO: renamed from: a */
    public Application f31388a;

    /* JADX INFO: renamed from: b */
    public wu5 f31389b;

    /* JADX INFO: renamed from: c */
    public mq5 f31390c;

    /* JADX INFO: renamed from: d */
    public hu5 f31391d;

    /* JADX INFO: renamed from: e */
    public yg3 f31392e;

    /* JADX INFO: renamed from: f */
    public fx5 f31393f;

    /* JADX INFO: renamed from: g */
    public Dialog f31394g;

    /* JADX INFO: renamed from: h */
    public ru5 f31395h;

    /* JADX INFO: renamed from: i */
    public AtomicBoolean f31396i;

    /* JADX INFO: renamed from: j */
    public AtomicReference f31397j;

    /* JADX INFO: renamed from: k */
    public AtomicReference f31398k;

    /* JADX INFO: renamed from: l */
    public AtomicReference f31399l;

    /* JADX INFO: renamed from: m */
    public boolean f31400m;

    /* JADX INFO: renamed from: n */
    public boolean f31401n;

    /* JADX INFO: renamed from: a */
    public final void m11129a(Activity activity, al0 al0Var) {
        ky5.m7752a();
        ((Queue) this.f31393f.f19400h.get()).add(Long.valueOf(System.currentTimeMillis()));
        if (!this.f31396i.compareAndSet(false, true)) {
            n56 n56Var = new n56(3, true != this.f31400m ? "ConsentForm#show can only be invoked once." : "Privacy options form is being loading. Please try again later.");
            m11132d(n56Var);
            al0Var.mo3042a(n56Var.m8537a());
            return;
        }
        ru5 ru5Var = this.f31395h;
        C1372yl c1372yl = ru5Var.f29648b;
        Objects.requireNonNull(c1372yl);
        ju5 ju5Var = new ju5((byte) 0);
        ju5Var.f22636b = c1372yl;
        VarHandle.storeStoreFence();
        ru5Var.f29647a.post(ju5Var);
        bs5 bs5Var = new bs5();
        bs5Var.f15558b = this;
        bs5Var.f15557a = activity;
        this.f31388a.registerActivityLifecycleCallbacks(bs5Var);
        this.f31399l.set(bs5Var);
        this.f31389b.f33746a = activity;
        Dialog dialog = new Dialog(activity, R.style.Theme.Translucent.NoTitleBar);
        dialog.setContentView(this.f31395h);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            n56 n56Var2 = new n56(3, "Activity with null windows is passed in.");
            m11132d(n56Var2);
            al0Var.mo3042a(n56Var2.m8537a());
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setFlags(16777216, 16777216);
        z62.m13363V(window);
        this.f31398k.set(al0Var);
        dialog.show();
        this.f31394g = dialog;
        this.f31395h.m10444a("UMP_messagePresented", "");
        m11132d(null);
    }

    /* JADX INFO: renamed from: b */
    public final void m11130b(pv4 pv4Var, ov4 ov4Var) {
        fx5 fx5Var = this.f31393f;
        this.f31395h = this.f31392e.m13120r();
        if (!this.f31400m) {
            ((Queue) fx5Var.f19402j.get()).add(Long.valueOf(System.currentTimeMillis()));
        }
        ru5 ru5Var = this.f31395h;
        ru5Var.setBackgroundColor(0);
        ru5Var.getSettings().setJavaScriptEnabled(true);
        ru5Var.getSettings().setAllowFileAccess(false);
        ru5Var.getSettings().setAllowContentAccess(false);
        ru5Var.setWebViewClient(new nu5(ru5Var));
        if (!this.f31400m) {
            fx5Var.m5845a((Queue) fx5Var.f19402j.get(), 3, 2, null);
        }
        AtomicReference atomicReference = this.f31397j;
        ds5 ds5Var = new ds5();
        ds5Var.f17335a = pv4Var;
        ds5Var.f17336b = ov4Var;
        VarHandle.storeStoreFence();
        atomicReference.set(ds5Var);
        ru5 ru5Var2 = this.f31395h;
        hu5 hu5Var = this.f31391d;
        ru5Var2.loadDataWithBaseURL(hu5Var.f20885a, hu5Var.f20886b, "text/html", "UTF-8", null);
        Handler handler = ky5.f23626a;
        RunnableC1029pc runnableC1029pc = new RunnableC1029pc((byte) 12);
        runnableC1029pc.f27515b = this;
        VarHandle.storeStoreFence();
        handler.postDelayed(runnableC1029pc, 10000L);
    }

    /* JADX INFO: renamed from: c */
    public final void m11131c(n56 n56Var) {
        ds5 ds5Var = (ds5) this.f31397j.getAndSet(null);
        if (ds5Var == null) {
            return;
        }
        if (!this.f31400m) {
            String message = n56Var.getMessage();
            boolean z = this.f31401n;
            fx5 fx5Var = this.f31393f;
            if (z) {
                fx5Var.m5845a((Queue) fx5Var.f19401i.get(), 10, 11, message);
            } else {
                fx5Var.m5845a((Queue) fx5Var.f19399g.get(), 4, 5, message);
            }
        }
        ds5Var.mo4677d(n56Var.m8537a());
    }

    /* JADX INFO: renamed from: d */
    public final void m11132d(n56 n56Var) {
        if (this.f31400m) {
            return;
        }
        String message = n56Var == null ? null : n56Var.getMessage();
        boolean z = this.f31401n;
        fx5 fx5Var = this.f31393f;
        if (z) {
            fx5Var.m5845a((Queue) fx5Var.f19401i.get(), 10, 11, message);
        } else {
            fx5Var.m5845a((Queue) fx5Var.f19400h.get(), 6, 7, message);
        }
    }
}
