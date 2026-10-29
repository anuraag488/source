package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class sn1 extends ag0 {

    /* JADX INFO: renamed from: v */
    public js1 f30402v;

    /* JADX INFO: renamed from: w */
    public ok2 f30403w;

    /* JADX INFO: renamed from: x */
    public boolean f30404x;

    /* JADX INFO: renamed from: y */
    public boolean f30405y;

    /* JADX INFO: renamed from: z */
    public boolean f30406z;

    /* JADX INFO: renamed from: j */
    public static boolean m10875j(eo1 eo1Var) {
        fk2 fk2Var = fk2.f19056c;
        boolean zM10875j = false;
        for (pn1 pn1Var : eo1Var.f18306c.m12119F()) {
            if (pn1Var != null) {
                rn1 rn1Var = pn1Var.f27798u;
                if ((rn1Var == null ? null : rn1Var.f29434y) != null) {
                    zM10875j |= m10875j(pn1Var.m9577e());
                }
                qo1 qo1Var = pn1Var.f27771P;
                if (qo1Var != null) {
                    qo1Var.m9993a();
                    if (qo1Var.f28637d.f26810h.m5728a(fk2.f19057d)) {
                        pn1Var.f27771P.f28637d.m9156h(fk2Var);
                        zM10875j = true;
                    }
                }
                if (pn1Var.f27769N.f26810h.m5728a(fk2.f19057d)) {
                    pn1Var.f27769N.m9156h(fk2Var);
                    zM10875j = true;
                }
            }
        }
        return zM10875j;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length != 0) {
            String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation")) {
                        return;
                    }
                    break;
                case 100470631:
                    if (str2.equals("--dump-dumpable")) {
                        return;
                    }
                    break;
                case 472614934:
                    if (str2.equals("--list-dumpables")) {
                        return;
                    }
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture")) {
                        return;
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill")) {
                        return;
                    }
                    break;
            }
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str3 = str + "  ";
        printWriter.print(str3);
        printWriter.print("mCreated=");
        printWriter.print(this.f30404x);
        printWriter.print(" mResumed=");
        printWriter.print(this.f30405y);
        printWriter.print(" mStopped=");
        printWriter.print(this.f30406z);
        if (getApplication() != null) {
            z32.m13299D(this).m13328x(str3, printWriter);
        }
        ((rn1) this.f30402v.f22555a).f29433x.m5264w(str, fileDescriptor, printWriter, strArr);
    }

    @Override // p000.ag0, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.f30402v.m7280q();
        super.onActivityResult(i, i2, intent);
    }

    @Override // p000.ag0, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f30403w.m9154f(ek2.ON_CREATE);
        eo1 eo1Var = ((rn1) this.f30402v.f22555a).f29433x;
        eo1Var.f18295H = false;
        eo1Var.f18296I = false;
        eo1Var.f18302O.f20752g = false;
        eo1Var.m5263v(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        tn1 tn1Var = (tn1) ((rn1) this.f30402v.f22555a).f29433x.f18309f.onCreateView(null, str, context, attributeSet);
        return tn1Var == null ? super.onCreateView(str, context, attributeSet) : tn1Var;
    }

    @Override // android.app.Activity
    public final void onDestroy() throws Exception {
        super.onDestroy();
        ((rn1) this.f30402v.f22555a).f29433x.m5254m();
        this.f30403w.m9154f(ek2.ON_DESTROY);
    }

    @Override // p000.ag0, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((rn1) this.f30402v.f22555a).f29433x.m5252k();
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f30405y = false;
        eo1 eo1Var = ((rn1) this.f30402v.f22555a).f29433x;
        if (eo1Var.f18311h != null) {
            eo1Var.m5243d();
        }
        eo1Var.m5263v(5);
        this.f30403w.m9154f(ek2.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        this.f30403w.m9154f(ek2.ON_RESUME);
        eo1 eo1Var = ((rn1) this.f30402v.f22555a).f29433x;
        eo1Var.f18295H = false;
        eo1Var.f18296I = false;
        eo1Var.f18302O.f20752g = false;
        eo1Var.m5263v(7);
    }

    @Override // p000.ag0, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f30402v.m7280q();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final void onResume() {
        js1 js1Var = this.f30402v;
        js1Var.m7280q();
        super.onResume();
        this.f30405y = true;
        ((rn1) js1Var.f22555a).f29433x.m5217A(true);
    }

    @Override // android.app.Activity
    public final void onStart() {
        js1 js1Var = this.f30402v;
        js1Var.m7280q();
        rn1 rn1Var = (rn1) js1Var.f22555a;
        super.onStart();
        this.f30406z = false;
        if (!this.f30404x) {
            this.f30404x = true;
            eo1 eo1Var = rn1Var.f29433x;
            eo1Var.f18295H = false;
            eo1Var.f18296I = false;
            eo1Var.f18302O.f20752g = false;
            eo1Var.m5263v(4);
        }
        rn1Var.f29433x.m5217A(true);
        this.f30403w.m9154f(ek2.ON_START);
        eo1 eo1Var2 = rn1Var.f29433x;
        eo1Var2.f18295H = false;
        eo1Var2.f18296I = false;
        eo1Var2.f18302O.f20752g = false;
        eo1Var2.m5263v(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f30402v.m7280q();
    }

    @Override // android.app.Activity
    public final void onStop() {
        eo1 eo1Var;
        js1 js1Var = this.f30402v;
        super.onStop();
        this.f30406z = true;
        do {
            eo1Var = ((rn1) js1Var.f22555a).f29433x;
            fk2 fk2Var = fk2.f19054a;
        } while (m10875j(eo1Var));
        eo1 eo1Var2 = ((rn1) js1Var.f22555a).f29433x;
        eo1Var2.f18296I = true;
        eo1Var2.f18302O.f20752g = true;
        eo1Var2.m5263v(4);
        this.f30403w.m9154f(ek2.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        tn1 tn1Var = (tn1) ((rn1) this.f30402v.f22555a).f29433x.f18309f.onCreateView(view, str, context, attributeSet);
        return tn1Var == null ? super.onCreateView(view, str, context, attributeSet) : tn1Var;
    }
}
