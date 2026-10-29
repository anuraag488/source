package p000;

import android.R;
import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.textclassifier.TextClassification;
import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: renamed from: ch */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0527ch {

    /* JADX INFO: renamed from: a */
    public C0575dh f16009a;

    /* JADX INFO: renamed from: b */
    public C0454ah f16010b;

    /* JADX INFO: renamed from: c */
    public C0454ah f16011c;

    /* JADX INFO: renamed from: d */
    public View f16012d;

    /* JADX INFO: renamed from: a */
    public final boolean m4025a(Menu menu) {
        int i;
        int i2;
        dj4 dj4Var = (dj4) this.f16010b.invoke();
        byte b = 0;
        if (z62.m13387o(dj4Var, null)) {
            return false;
        }
        menu.clear();
        List list = dj4Var.f17107a;
        int size = list.size();
        byte b2 = 1;
        int i3 = 0;
        int i4 = 1;
        int i5 = 1;
        while (i3 < size) {
            cj4 cj4Var = (cj4) list.get(i3);
            if (cj4Var instanceof kj4) {
                i = i4 + 1;
                Object obj = cj4Var.f16067a;
                if (z62.m13387o(obj, se0.f30202o)) {
                    i2 = R.id.cut;
                } else if (z62.m13387o(obj, se0.f30203p)) {
                    i2 = R.id.copy;
                } else if (z62.m13387o(obj, se0.f30204q)) {
                    i2 = R.id.paste;
                } else if (z62.m13387o(obj, se0.f30205r)) {
                    i2 = R.id.selectAll;
                } else {
                    i2 = z62.m13387o(obj, se0.f30206s) ? R.id.autofill : i4;
                }
                kj4 kj4Var = (kj4) cj4Var;
                MenuItem menuItemAdd = menu.add(i5, i2, i4, kj4Var.f23180b);
                menuItemAdd.setShowAsAction(2);
                MenuItemOnMenuItemClickListenerC0491bh menuItemOnMenuItemClickListenerC0491bh = new MenuItemOnMenuItemClickListenerC0491bh(b);
                menuItemOnMenuItemClickListenerC0491bh.f15262b = kj4Var;
                menuItemOnMenuItemClickListenerC0491bh.f15263c = this;
                VarHandle.storeStoreFence();
                menuItemAdd.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC0491bh);
            } else {
                if (cj4Var instanceof qj4) {
                    i = i4 + 1;
                    Context context = this.f16012d.getContext();
                    qj4 qj4Var = (qj4) cj4Var;
                    TextClassification textClassification = qj4Var.f28530b;
                    int i6 = qj4Var.f28531c;
                    Drawable drawable = qj4Var.f28532d;
                    if (i6 < 0) {
                        MenuItem menuItemAdd2 = menu.add(R.id.textAssist, R.id.textAssist, i4, textClassification.getLabel());
                        menuItemAdd2.setShowAsAction(2);
                        menuItemAdd2.setIcon(drawable);
                        MenuItemOnMenuItemClickListenerC0491bh menuItemOnMenuItemClickListenerC0491bh2 = new MenuItemOnMenuItemClickListenerC0491bh(b2);
                        menuItemOnMenuItemClickListenerC0491bh2.f15262b = context;
                        menuItemOnMenuItemClickListenerC0491bh2.f15263c = textClassification;
                        VarHandle.storeStoreFence();
                        menuItemAdd2.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC0491bh2);
                    } else {
                        byte b3 = i6 == 0 ? (byte) 1 : b;
                        RemoteAction remoteAction = textClassification.getActions().get(i6);
                        MenuItem menuItemAdd3 = menu.add(R.id.textAssist, b3 != 0 ? 16908353 : b, i4, remoteAction.getTitle());
                        menuItemAdd3.setShowAsAction(b3 == 0 ? 0 : 2);
                        if (drawable != null) {
                            menuItemAdd3.setIcon(drawable);
                        }
                        zl4 zl4Var = new zl4();
                        zl4Var.f36170a = remoteAction;
                        VarHandle.storeStoreFence();
                        menuItemAdd3.setOnMenuItemClickListener(zl4Var);
                    }
                } else if (cj4Var instanceof oj4) {
                    i5++;
                }
                i3++;
                b = 0;
            }
            i4 = i;
            i3++;
            b = 0;
        }
        return true;
    }
}
