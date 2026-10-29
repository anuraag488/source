package p000;

import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.LocaleList;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class tb3 {

    /* JADX INFO: renamed from: a */
    public ro0 f31053a;

    /* JADX INFO: renamed from: b */
    public Context f31054b;

    /* JADX INFO: renamed from: c */
    public j04 f31055c;

    /* JADX INFO: renamed from: d */
    public zm2 f31056d;

    /* JADX INFO: renamed from: e */
    public gx2 f31057e;

    /* JADX INFO: renamed from: f */
    public TextClassifier f31058f;

    /* JADX INFO: renamed from: g */
    public d83 f31059g;

    /* JADX INFO: renamed from: h */
    public Object f31060h;

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c8, code lost:
    
        if (r3.m6191e(r4) == r5) goto L36;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m11023a(CharSequence charSequence, long j, TextClassifier textClassifier, ym0 ym0Var) {
        qb3 qb3Var;
        long j2;
        CharSequence charSequence2;
        TextClassifier textClassifier2;
        gx2 gx2Var;
        aj4 aj4VarM11024b;
        d83 d83Var = this.f31059g;
        gx2 gx2Var2 = this.f31057e;
        if (ym0Var instanceof qb3) {
            qb3Var = (qb3) ym0Var;
            int i = qb3Var.f28366z;
            if ((i & Integer.MIN_VALUE) != 0) {
                qb3Var.f28366z = i - Integer.MIN_VALUE;
            } else {
                qb3Var = new qb3(this, ym0Var);
            }
        } else {
            qb3Var = new qb3(this, ym0Var);
        }
        Object obj = qb3Var.f28364x;
        ap0 ap0Var = ap0.f14763a;
        int i2 = qb3Var.f28366z;
        ju4 ju4Var = ju4.f22634a;
        try {
            if (i2 == 0) {
                k43.m7376J(obj);
                qb3Var.f28360t = charSequence;
                qb3Var.f28361u = textClassifier;
                qb3Var.f28362v = gx2Var2;
                j2 = j;
                qb3Var.f28363w = j2;
                qb3Var.f28366z = 1;
                if (gx2Var2.m6191e(qb3Var) != ap0Var) {
                    charSequence2 = charSequence;
                    textClassifier2 = textClassifier;
                    gx2Var = gx2Var2;
                }
                return ap0Var;
            }
            if (i2 == 1) {
                j2 = qb3Var.f28363w;
                gx2Var = qb3Var.f28362v;
                textClassifier2 = (TextClassifier) qb3Var.f28361u;
                charSequence2 = (CharSequence) qb3Var.f28360t;
                k43.m7376J(obj);
            } else {
                if (i2 != 2) {
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gx2Var2 = (gx2) qb3Var.f28361u;
                aj4VarM11024b = (aj4) qb3Var.f28360t;
                k43.m7376J(obj);
            }
            try {
                d83Var.setValue(aj4VarM11024b);
                return ju4Var;
            } finally {
                gx2Var2.m6193g(null);
            }
            aj4 aj4Var = (aj4) d83Var.getValue();
            if (aj4Var != null) {
                if (ql4.m9899c(j2, aj4Var.f14543b) && z62.m13387o(charSequence2, aj4Var.f14542a)) {
                    gx2Var.m6193g(null);
                    return ju4Var;
                }
            }
            gx2Var.m6193g(null);
            aj4VarM11024b = m11024b(charSequence2, j2, textClassifier2.classifyText(new TextClassification.Request.Builder(charSequence2, ql4.m9903g(j2), ql4.m9902f(j2)).setDefaultLocales(m11025c()).build()));
            qb3Var.f28360t = aj4VarM11024b;
            qb3Var.f28361u = gx2Var2;
            qb3Var.f28362v = null;
            qb3Var.f28366z = 2;
        } catch (Throwable th) {
            gx2Var.m6193g(null);
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final aj4 m11024b(CharSequence charSequence, long j, TextClassification textClassification) {
        Icon icon;
        int size = textClassification.getActions().size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            RemoteAction remoteAction = textClassification.getActions().get(i);
            RemoteAction remoteAction2 = remoteAction;
            Drawable drawableLoadDrawable = null;
            if (i != 0 && !remoteAction2.shouldShowIcon()) {
                remoteAction = null;
            }
            RemoteAction remoteAction3 = remoteAction;
            if (remoteAction3 != null && (icon = remoteAction3.getIcon()) != null) {
                drawableLoadDrawable = icon.loadDrawable(this.f31054b);
            }
            arrayList.add(drawableLoadDrawable);
        }
        aj4 aj4Var = new aj4();
        aj4Var.f14542a = charSequence;
        aj4Var.f14543b = j;
        aj4Var.f14544c = textClassification;
        aj4Var.f14545d = arrayList;
        VarHandle.storeStoreFence();
        return aj4Var;
    }

    /* JADX INFO: renamed from: c */
    public final LocaleList m11025c() {
        zm2 zm2Var = this.f31056d;
        if (zm2Var == null) {
            return new LocaleList(((ym2) kb3.f23056a.m7249x().f36183a.get(0)).f35328a);
        }
        ArrayList arrayList = new ArrayList(ib0.m6717y0(zm2Var, 10));
        Iterator it = zm2Var.f36183a.iterator();
        while (it.hasNext()) {
            arrayList.add(((ym2) it.next()).f35328a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
