package p000;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class n15 extends ContentObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f25389a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f25390b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n15(Object obj, byte b) {
        super(null);
        this.f25389a = b;
        this.f25390b = obj;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        switch (this.f25389a) {
            case 1:
                ((AtomicBoolean) ((if1) this.f25390b).f21324a).set(true);
                return;
            case 2:
                hd6 hd6Var = (hd6) this.f25390b;
                synchronized (hd6Var.f20503e) {
                    hd6Var.f20504f = null;
                    hd6Var.f20501c.run();
                    break;
                }
                synchronized (hd6Var) {
                    try {
                        Iterator it = hd6Var.f20505g.iterator();
                        if (it.hasNext()) {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                            throw null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                super.onChange(z);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n15(f40 f40Var, Handler handler) {
        super(handler);
        this.f25389a = (byte) 0;
        this.f25390b = f40Var;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z, Uri uri) {
        switch (this.f25389a) {
            case 0:
                ((f40) this.f25390b).mo5493n(ju4.f22634a);
                break;
            default:
                super.onChange(z, uri);
                break;
        }
    }
}
