package p000;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fl3 implements InputConnection {

    /* JADX INFO: renamed from: a */
    public w42 f19080a;

    /* JADX INFO: renamed from: b */
    public boolean f19081b;

    /* JADX INFO: renamed from: c */
    public int f19082c;

    /* JADX INFO: renamed from: d */
    public xk4 f19083d;

    /* JADX INFO: renamed from: e */
    public int f19084e;

    /* JADX INFO: renamed from: f */
    public boolean f19085f;

    /* JADX INFO: renamed from: g */
    public ArrayList f19086g;

    /* JADX INFO: renamed from: h */
    public boolean f19087h;

    /* JADX INFO: renamed from: a */
    public final void m5731a(a71 a71Var) {
        this.f19082c++;
        try {
            this.f19086g.add(a71Var);
        } finally {
            m5732b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5732b() {
        ArrayList arrayList = this.f19086g;
        int i = this.f19082c - 1;
        this.f19082c = i;
        if (i == 0 && !arrayList.isEmpty()) {
            ((dl4) this.f19080a.f33090b).f17162e.invoke(new ArrayList(arrayList));
            arrayList.clear();
        }
        return this.f19082c > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.f19087h;
        if (!z) {
            return z;
        }
        this.f19082c++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m5733c(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.f19087h;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f19086g.clear();
        this.f19082c = 0;
        this.f19087h = false;
        ArrayList arrayList = ((dl4) this.f19080a.f33090b).f17166i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (z62.m13387o(((WeakReference) arrayList.get(i)).get(), this)) {
                arrayList.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.f19087h;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.f19087h;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.f19087h;
        return z ? this.f19081b : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.f19087h;
        if (z) {
            m5731a(new xd0(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.f19087h;
        if (!z) {
            return z;
        }
        m5731a(new ey0(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.f19087h;
        if (!z) {
            return z;
        }
        m5731a(new fy0(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return m5732b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.f19087h;
        if (!z) {
            return z;
        }
        m5731a(new zf1());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        xk4 xk4Var = this.f19083d;
        return TextUtils.getCapsMode(xk4Var.f34341a.f24092b, ql4.m9903g(xk4Var.f34342b), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.f19085f = z;
        if (z) {
            this.f19084e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return i20.m6571F(this.f19083d);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (ql4.m9900d(this.f19083d.f34342b)) {
            return null;
        }
        return zt5.m13792y(this.f19083d).f24092b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return zt5.m13793z(this.f19083d, i).f24092b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return zt5.m13756A(this.f19083d, i).f24092b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.f19087h;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    m5731a(new w34(0, this.f19083d.f34341a.f24092b.length()));
                    break;
                case R.id.cut:
                    m5733c(277);
                    return false;
                case R.id.copy:
                    m5733c(278);
                    return false;
                case R.id.paste:
                    m5733c(279);
                    return false;
                default:
                    return false;
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
        boolean z = this.f19087h;
        if (z) {
            z = true;
            if (i != 0) {
                switch (i) {
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case 5:
                        i2 = 6;
                        break;
                    case 6:
                        i2 = 7;
                        break;
                    case 7:
                        i2 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i);
                        i2 = 1;
                        break;
                }
            } else {
                i2 = 1;
            }
            ((dl4) this.f19080a.f33090b).f17163f.invoke(k12.m7357a(i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.f19087h;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        boolean z = this.f19087h;
        if (!z) {
            return z;
        }
        boolean z2 = false;
        boolean z3 = (i & 1) != 0;
        boolean z4 = (i & 2) != 0;
        boolean z5 = (i & 16) != 0;
        boolean z6 = (i & 8) != 0;
        boolean z7 = (i & 4) != 0;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34 && (i & 32) != 0) {
            z2 = true;
        }
        if (!z5 && !z6 && !z7 && !z2) {
            if (i2 >= 34) {
                z2 = true;
                z5 = true;
            } else {
                z5 = true;
            }
            z6 = z5;
            z7 = z6;
        }
        ds0 ds0Var = ((dl4) this.f19080a.f33090b).f17169l;
        synchronized (ds0Var.f17315c) {
            try {
                ds0Var.f17318f = z5;
                ds0Var.f17319g = z6;
                ds0Var.f17320h = z7;
                ds0Var.f17321i = z2;
                if (z3) {
                    ds0Var.f17317e = true;
                    if (ds0Var.f17322j != null) {
                        ds0Var.m4664a();
                    }
                }
                ds0Var.f17316d = z4;
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.f19087h;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) ((dl4) this.f19080a.f33090b).f17167j.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.f19087h;
        if (z) {
            m5731a(new u34(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.f19087h;
        if (z) {
            m5731a(new v34(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.f19087h;
        if (!z) {
            return z;
        }
        m5731a(new w34(i, i2));
        return true;
    }
}
