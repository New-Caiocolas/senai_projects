import customtkinter as ctk

#funções---------------

def imc():
    p = peso.get()
    a = altura.get()
    imc = (int(p) / (float(a) * float(a)))

    if imc < 18.5:
        nivel = 'magreza'
    elif imc >= 18.5 and imc <= 24.9:
        nivel = 'normal'
    elif imc >= 25 and imc <= 29.9:
        nivel = 'sobrepeso'
    elif imc >= 30 and imc <= 39.9:
        nivel = 'obesidade'
    else:
        nivel = 'obesidade grave'
    resultado.configure(text=(f'O seu IMC é {imc:.2f} você está em: {nivel}'))

#-----------------------

#Iniciando janela
ctk.set_appearance_mode('dark')
app = ctk.CTk()
app.geometry("500x400")
app.resizable(False,False)
app.title('APP Saúde')
#------------------------

label = ctk.CTkLabel(app,
                    text='APP SAÚDE 2024',
                    fg_color='transparent',
                    font=('arial', 22, 'bold'),
                    text_color='yellow')
label.pack(pady='10')

peso = ctk.CTkEntry(app,
                    placeholder_text='Digite seu peso', 
                    width=350, 
                    height=30)
peso.pack(pady='16')

altura = ctk.CTkEntry(app, 
                      placeholder_text='Digite sua altura', 
                      width=350, 
                      height=30)
altura.pack()

btn = ctk.CTkButton(app, 
                    text='CALCULAR', 
                    command=imc, 
                    width=200, 
                    height=35,
                    fg_color='yellow',
                    text_color='black')
btn.pack(pady='16')

resultado = ctk.CTkLabel(app, 
                        text='', 
                        font=('arial',16))
resultado.pack()



app.mainloop()