import customtkinter as ctk

#Selecionar tema dark para janela
ctk.set_appearance_mode('dark')

def converter():
    dolar = entry.get()
    real = (float(dolar) * 5.50)
    label.configure(text=(f'${dolar} = R${real:.2f}'))

#criar janela
janela = ctk.CTk()
janela.geometry("400x250")
janela.title("Cambio")
janela.resizable(False,False)
janela.iconbitmap('icon.ico')

#criação de titulo
ctk.CTkLabel(janela,
                    text='Sistema de conversão',
                    font=('arial',18,'bold')).pack(pady=20)

#crianção do entry
entry = ctk.CTkEntry(janela,
                    placeholder_text='DIGITE O VALOR EM DÓLAR',
                    width=200,
                    height=40)
entry.pack()

#criação botao
button = ctk.CTkButton(janela, 
                       text='Enter',
                       font=('arial',14),
                       width=200,
                       height=40,
                       command=converter)
button.pack(pady='20')

label = ctk.CTkLabel(janela,
                    text='',
                    font=('arial',16))
label.pack(pady=20)

janela.mainloop()
